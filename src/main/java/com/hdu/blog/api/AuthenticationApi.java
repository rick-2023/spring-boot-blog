package com.hdu.blog.api;

import com.alibaba.fastjson.JSONObject;
import com.hdu.blog.model.User;
import com.hdu.blog.service.AuthenticationService;
import com.hdu.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/5/2.
 */
@RestController
@RequestMapping("/api/authentication")
public class AuthenticationApi {
	private AuthenticationService authenticationService;
	private UserService userService;

	@Autowired
	public AuthenticationApi(AuthenticationService authenticationService, UserService userService) {
		this.authenticationService = authenticationService;
		this.userService = userService;
	}
	@PostMapping("")
	public Object login(@RequestBody User user){
		User userInData = userService.findByName(user.getName());
		JSONObject jsonObject = new JSONObject();
		if(userInData == null){
			jsonObject.put("error","用户不存在");
		}else if (!userService.comparePassword(user, userInData)){
			jsonObject.put("error","密码不正确");
		}else{
			String token = authenticationService.getToken(userInData);
			jsonObject.put("token",token);
			jsonObject.put("user",userInData);
		}
		return jsonObject;
	}
}
