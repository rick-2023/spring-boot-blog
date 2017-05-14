package com.hdu.blog.mapper;

import com.hdu.blog.model.Post;
import com.hdu.blog.model.User;

import java.util.List;

/**
 * Created by Administrator on 2017/5/13 0013.
 */
public interface PostMapper {
    void add(Post post);
    Post findOne(Post param);

    void update(Post post, User currentUser);

    void delete(Integer id);

    List<Post> all();
}
