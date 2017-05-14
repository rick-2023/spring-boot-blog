package com.hdu.blog.api;

import com.alibaba.fastjson.JSONObject;
import com.hdu.blog.annotation.CurrentUser;
import com.hdu.blog.annotation.LoginRequired;
import com.hdu.blog.model.Post;
import com.hdu.blog.model.User;
import com.hdu.blog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2017/5/13 0013.
 */
@RestController
@RequestMapping("/api/post")
public class PostApi {
    private PostService postService;

    @Autowired
    public PostApi(PostService postService) {
        this.postService = postService;
    }
    @PostMapping("")
    @LoginRequired
    public Post add(@RequestBody Post post, @CurrentUser User user){
        post.setAuthorId(user.getId());
        post = postService.add(post);
        return post;
    }
    @GetMapping("/{id}")
    public Object findById(@PathVariable int id){
        Post post = postService.findById(id);
        if(post == null){
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("message", "文章不存在");
            return jsonObject;
        }
        return post;
    }
}
