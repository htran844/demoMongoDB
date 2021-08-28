package com.example.testmongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.testmongo.model.Post;
import com.example.testmongo.repository.RepoPost;

@RestController
public class PostController {
	
	@Autowired
	public RepoPost repoPost;
	
	@GetMapping("/all")
	public List<Post> getAll(){
		
		return repoPost.findAll();
	}
	
	@PostMapping("/all")
	public String createPost(@RequestBody Post post) {
		Post p =  repoPost.insert(post);
		return "tao thanh cong" + p.getTitle();
	}
}
