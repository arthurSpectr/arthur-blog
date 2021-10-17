package com.techqar.service;

import com.techqar.model.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MockPostRepoService {

    public List<Post> testData() {

        Post post = new Post("First post", "This is my first post, glad to see you here");
        Post post2 = new Post("Second post", "This is my second post, glad to see you here");
        Post post3 = new Post("Third post", "This is my third post, glad to see you here");

        return List.of(post, post2, post3);
    }

}
