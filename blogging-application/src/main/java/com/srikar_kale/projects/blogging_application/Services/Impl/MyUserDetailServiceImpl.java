package com.srikar_kale.projects.blogging_application.Services.Impl;

import com.srikar_kale.projects.blogging_application.Models.Account;
import com.srikar_kale.projects.blogging_application.Services.AccountService;
import com.srikar_kale.projects.blogging_application.Services.MyUserDetailService;
import org.hibernate.sql.model.ast.builder.CollectionRowDeleteByUpdateSetNullBuilder;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MyUserDetailServiceImpl implements MyUserDetailService {
    private final AccountService accountService;

    public MyUserDetailServiceImpl(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Account> optionalAccount = accountService.findByEmail(username);

        if (!optionalAccount.isPresent()) {
            throw new UsernameNotFoundException("Username not found");
        }

        Account account = optionalAccount.get();

        List<GrantedAuthority> grantedAuthorities = account.getAuthorities().stream()
                .map(authority -> new SimpleGrantedAuthority(authority.getName()))
                .collect(Collectors.toList());

        return new org.springframework.security.core.userdetails.User(
                account.getEmail(),
                account.getPassword(),
                grantedAuthorities
        );
    }
}
