package com.hdu.blog.api;

import com.alibaba.fastjson.JSONObject;
import com.hdu.blog.annotation.CurrentUser;
import com.hdu.blog.annotation.LoginRequired;
import com.hdu.blog.model.Post;
import com.hdu.blog.model.User;
import com.hdu.blog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("")
    public List<Post> all() {
        return postService.all();
    }

    /**
     * 更新文章，需要登录
     *
     * @param post        需要修改的内容
     * @param id          文章 id
     * @param currentUser 当前用户
     * @return 更新之后的文章
     */

    @LoginRequired
    @PutMapping("/{id}")
    public Post update(@RequestBody Post post, @PathVariable int id, @CurrentUser User currentUser) {
            post.setId(id);
            return postService.update(post,currentUser);
    }
    /**
     * 删除文章，需要登录
     * @param id 文章 id
     * @param currentUser 当前登录用户
     * @return 提示信息
     */
    @LoginRequired
    @DeleteMapping("/{id}")
    public Object delete(@PathVariable Integer id,@CurrentUser User currentUser){
            postService.delete(id,currentUser);
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("message","删除成功");
            return jsonObject;
    }



    @PostMapping("")
    @LoginRequired
    public Post add(@RequestBody Post post, @CurrentUser User user) {
        post.setAuthorId(user.getId());
        post = postService.add(post);
        return post;
    }

    @GetMapping("/{id}")
    public Object findById(@PathVariable int id) {
        Post post = postService.findById(id);
        if (post == null) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("message", "文章不存在");
            return jsonObject;
        }
        return post;
    }
}
