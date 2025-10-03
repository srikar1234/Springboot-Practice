package com.srikar_kale.projects.blogging_application.Controllers;

import com.srikar_kale.projects.blogging_application.Models.Post;
import com.srikar_kale.projects.blogging_application.Services.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collections;
import java.util.List;

@Controller
public class HomeController {

    private final PostService postService;

    public HomeController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/")
    public String home(Model model){
        List<Post> listPost = postService.getAll().orElse(Collections.emptyList());
        model.addAttribute("posts", listPost);
        return "home";
    }
}
