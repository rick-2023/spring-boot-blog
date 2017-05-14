package com.hdu.blog.service;

import com.hdu.blog.mapper.PostMapper;
import com.hdu.blog.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2017/5/13 0013.
 */
@Service
public class PostService {
    private PostMapper postMapper;

    @Autowired
    public PostService(PostMapper postMapper){
        this.postMapper = postMapper;
    }

    @Transactional
    public Post  add(Post post){
        postMapper.add(post);
        return findById(post.getId());
    }

    public Post findById(Integer id) {
        Post param = new Post();
        param.setId(id);
        return postMapper.findOne(param);

    }
}
