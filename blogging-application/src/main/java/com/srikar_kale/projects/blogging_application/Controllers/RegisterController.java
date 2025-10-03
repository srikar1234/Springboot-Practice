package com.srikar_kale.projects.blogging_application.Controllers;

import com.srikar_kale.projects.blogging_application.Models.Account;
import com.srikar_kale.projects.blogging_application.Services.AccountService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {
    private final AccountService accountService;

    public RegisterController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/register")
    public String register(Model model){
        Account account = new Account();
        model.addAttribute(account);
        return "register";
    }

    @PostMapping("/register")
    public String loginUser(@ModelAttribute Account account){
        accountService.saveAccount(account);

        //Back to the homepage
        return "redirect:/";
    }
}
