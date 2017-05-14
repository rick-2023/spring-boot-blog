package com.hdu.blog.model;

import lombok.Data;

import java.util.Date;

/**
 * Created by Administrator on 2017/5/13 0013.
 */
@Data
public class Post {
    private Integer id;
    private User author;
    private Integer authorId;
    private String title;
    private String content;// 文章内容
    private Date createTime;


}
