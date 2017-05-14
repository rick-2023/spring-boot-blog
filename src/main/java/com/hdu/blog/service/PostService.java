package com.hdu.blog.service;

import com.hdu.blog.mapper.PostMapper;
import com.hdu.blog.model.Post;
import com.hdu.blog.model.User;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

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

    public List<Post> all() {
       return postMapper.all();
    }

    public Post update(Post post, User currentUser) {
        checkNotNull(post.getId(),"文章不能为空");
        cheeckOwner(post.getId(),currentUser);
        postMapper.update(post,currentUser);
        return findById(post.getId());
    }
    private void cheeckOwner(Integer id,User currentUser){
        Post post = findById(id);
        if(! post.getAuthorId().equals(currentUser.getId())){
            throw  new RuntimeException("不能删除或修改别人的文章");
        }
    }

    public void delete(Integer id, User currentUser) {
        cheeckOwner(id,currentUser);
        postMapper.delete(id);
    }
}
