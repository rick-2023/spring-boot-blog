package com.hdu.blog.service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.hdu.blog.model.User;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;

/**
 * Created by Administrator on 2017/5/2.
 */
@Service
public class AuthenticationService {

	public String getToken(User user) {
		String token = "";
		try {
			token = JWT.create()
					.withAudience(user.getId().toString())
					.sign(Algorithm.HMAC256(user.getPassword()));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return token;
	}
}
