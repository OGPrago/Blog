package com.jg.blog.controller;

import com.jg.blog.model.Post;
import com.jg.blog.service.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
@CrossOrigin()
public class PostController {

    @Autowired
    private PostServiceImpl postServiceImpl;

    @GetMapping // http://localhost:8080/api/posts
    public List<Post> getAllPost() {
        return postServiceImpl.retrieveAllPost();
    }

    @GetMapping("/{id}") // http://localhost:8080/api/posts/1
    public Post getPostById(@PathVariable Long id) {
        return postServiceImpl.retrievePostById(id);
    }

    @PostMapping // http://localhost:8080/api/posts
    public Post createpost(@RequestBody Post post) {
        return postServiceImpl.createPost(post);
    }

    @PutMapping("/{id}") // http://localhost:8080/api/posts/1
    public void updatePost(@PathVariable Long id, @RequestBody Post postBody) {
        postServiceImpl.updatePost(id, postBody);
    }

    @DeleteMapping("/{id}") // http://localhost:8080/api/posts/1
    public void deletePost(@PathVariable Long id) {
        postServiceImpl.deletePost(id);
    }
}
