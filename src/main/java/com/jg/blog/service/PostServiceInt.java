package com.jg.blog.service;

import com.jg.blog.model.Post;

import java.util.List;

public interface PostServiceInt {
    public List<Post> retrieveAllPost();
    public Post retrievePostById(Long id);
    public Post createPost(Post post);
    public void updatePost(Long id, Post postBody);
    public void deletePost(Long id);
}
