package com.example.testmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.testmongo.model.Post;

@Repository
public interface RepoPost extends MongoRepository<Post, String>{

}
