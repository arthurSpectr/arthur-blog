package com.techqar.controller;

import com.techqar.model.Post;
import com.techqar.service.MockPostRepoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
//@RequestMapping("/main-service")
public class PostController {

    @Autowired
    private MockPostRepoService postRepoService;

//    @GetMapping("/blog")
//    public String getPost(@RequestParam(value = "name", required = false) String name, Model model) {
//        model.addAttribute("name", name);
//        return "blog";
//    }

    @GetMapping("/")
    public String main(Model model) {
        model.addAttribute("name", "ivan");
        return "index";
    }

    @GetMapping("/all")
    public String getAllPosts(Model model) {
        List<Post> posts = postRepoService.testData();
        model.addAttribute("posts", posts);

        return "blog";
    }

}
