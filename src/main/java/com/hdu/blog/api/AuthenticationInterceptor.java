package com.hdu.blog.api;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.hdu.blog.annotation.LoginRequired;
import com.hdu.blog.model.User;
import com.hdu.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;

/**
 * Created by Administrator on 2017/5/9 0009.
 */
public class AuthenticationInterceptor implements HandlerInterceptor{
    @Autowired
    private UserService userService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //如果不是映射到方法直接通过
        if(!(handler instanceof HandlerMethod)){
            return true;
        }
        HandlerMethod handlerMethod = (HandlerMethod) handler;
            LoginRequired methodAnnotation = handlerMethod.getMethodAnnotation(LoginRequired.class);
            if (methodAnnotation != null){
                String token = request.getHeader("token");
                if(token == null){
                    throw new RuntimeException("token 为空,请登录");
                }
                int userId;
                try {
                    userId = Integer.parseInt(JWT.decode(token).getAudience().get(0));//从token中获取用户id
                }catch (JWTDecodeException e){
                    throw new RuntimeException("token 无效，请登录");
                }
                User user = userService.findById(userId);
                if(user == null){
                    throw new RuntimeException("用户不存在，请重新登录");
                }
                //验证token
                try {
                    JWTVerifier verifier = JWT.require(Algorithm.HMAC256(user.getPassword())).build();
                    try {
                        verifier.verify(token);
                    } catch (JWTVerificationException e) {
                        throw new RuntimeException("token无效，请重新登录");
                    }
                }catch (UnsupportedEncodingException ignore){}
                    request.setAttribute("currentUser",user);
                    return true;
            }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
