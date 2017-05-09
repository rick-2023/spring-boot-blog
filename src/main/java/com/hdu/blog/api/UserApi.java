package com.hdu.blog.api;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.hdu.blog.model.User;
import com.hdu.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2017/5/1.
 */
@RestController
@RequestMapping("/api/user")
public class UserApi {
	private UserService userService;

	@Autowired
	public UserApi(UserService userService){
		this.userService = userService;
	}
	@PostMapping("")
	public Object add(@RequestBody User user){
		if(userService.findByName(user.getName()) !=null){
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("message","用户名已被占用");
			return jsonObject;
		}
		return userService.add(user);
	}
	@GetMapping("/test")
	public int testErroe(){
		return 9/0;
	}
}
