package com.hdu.blog.mapper;

import com.hdu.blog.model.Post;

/**
 * Created by Administrator on 2017/5/13 0013.
 */
public interface PostMapper {
    void add(Post post);
    Post findOne(Post param);
}
