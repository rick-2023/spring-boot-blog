package com.hdu.blog.service;

import com.hdu.blog.mapper.UserMapper;
import com.hdu.blog.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Administrator on 2017/5/1.
 */
@Service
public class UserService {
	private UserMapper userMapper;

	@Autowired
	public UserService(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	//添加用户
	public User add(User user) {
		String passwordHash = passwordToHash(user.getPassword());
		user.setPassword(passwordHash);
		userMapper.add(user);
		return findById(user.getId());
	}
	//根据id查询用户
	public User findById(Integer id) {
		User user = new User();
		user.setId(id);
		return userMapper.findOne(user);
	}
	//根据姓名查询用户
	public User findByName(String name) {
		User param = new User();
		param.setName(name);
		return userMapper.findOne(param);
	}

	private String passwordToHash(String password){
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			digest.update(password.getBytes());
			byte[] src = digest.digest();
			StringBuilder stringBuilder = new StringBuilder();
			// 字节数组转16进制字符串
			// https://my.oschina.net/u/347386/blog/182717
			for (byte aSrc : src) {
				String s = Integer.toHexString(aSrc & 0xFF);
				if (s.length() < 2) {
					stringBuilder.append('0');
				}
				stringBuilder.append(s);
			}
			return stringBuilder.toString();
		} catch (NoSuchAlgorithmException ignore) {
		}
		return null;
	}

	public boolean comparePassword(User user, User userInData) {
			return passwordToHash(user.getPassword()).equals(userInData.getPassword());
	}
}
