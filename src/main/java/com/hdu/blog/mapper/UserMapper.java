package com.hdu.blog.mapper;

import com.hdu.blog.model.User;

/**
 * Created by Administrator on 2017/5/1.
 */
public interface UserMapper {


	 int add(User user) ;

	 User findOne(User param);
}
