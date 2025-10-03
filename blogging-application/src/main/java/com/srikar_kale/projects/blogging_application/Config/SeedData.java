package com.srikar_kale.projects.blogging_application.Config;

import com.srikar_kale.projects.blogging_application.Models.Account;
import com.srikar_kale.projects.blogging_application.Models.Post;
import com.srikar_kale.projects.blogging_application.Services.AccountService;
import com.srikar_kale.projects.blogging_application.Services.PostService;
import com.sun.jdi.connect.Connector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class SeedData implements CommandLineRunner {

    private final AccountService accountService;
    private final PostService postService;

    public SeedData(AccountService accountService, PostService postService) {
        this.accountService = accountService;
        this.postService = postService;
    }

    @Override
    public void run(String... args) throws Exception {
        Optional<List<Post>> postList = postService.getAll();
        if (postList.isPresent() && postList.get().isEmpty()) {

            Account ac1 = new Account();
            Account ac2 = new Account();
            ac1.setFirstName("User");
            ac1.setLastName("user");
            ac1.setEmail("user.user@domain.com");
            ac1.setPassword("password");

            ac2.setFirstName("Admin");
            ac2.setLastName("admin");
            ac2.setEmail("admin.admin@domain.com");
            ac2.setPassword("password");

            accountService.saveAccount(ac1);
            accountService.saveAccount(ac2);

            Post post1 = new Post();
            post1.setTitle("Title of post 1");
            post1.setBody("BCDJWAJDNJDJW");
            post1.setAccount(ac1);

            Post post2 = new Post();
            post2.setTitle("Title of post 2");
            post2.setBody("This is the body of post 2");
            post2.setAccount(ac2);

            postService.save(post1);
            postService.save(post2);
        }
    }
}
