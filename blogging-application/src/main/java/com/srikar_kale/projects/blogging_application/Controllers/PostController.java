package com.srikar_kale.projects.blogging_application.Controllers;

import com.srikar_kale.projects.blogging_application.Models.Account;
import com.srikar_kale.projects.blogging_application.Models.Post;
import com.srikar_kale.projects.blogging_application.Services.AccountService;
import com.srikar_kale.projects.blogging_application.Services.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Controller
public class PostController {
    private final PostService postService;
    private final AccountService accountService;

    public PostController(PostService postService, AccountService accountService) {
        this.postService = postService;
        this.accountService = accountService;
    }

    @GetMapping("/posts/{id}")
    public String getPost(@PathVariable Long id, Model model){
        Post getPostByPostId = postService.getById(id).orElse(null);
        if(getPostByPostId != null) {
            model.addAttribute("post", getPostByPostId);
            return "post";
        }
        else
            return "404";
    }

    @GetMapping("/posts/new")
    public String createNewPosts(Model model){
        Optional<Account> optionalAccount = accountService.findByEmail("user.user@domain.com");
        if(optionalAccount.isPresent()){
            Post newPost = new Post();
            newPost.setAccount(optionalAccount.get());
            model.addAttribute("post", newPost);
            return "write_post";
        }
        return "redirect:/";
    }

    @PostMapping("/posts/new")
    public String saveNewPosts(@ModelAttribute Post post){
        Post savedPost = postService.save(post);
        return "redirect:/posts/"+ savedPost.getId();
    }
}