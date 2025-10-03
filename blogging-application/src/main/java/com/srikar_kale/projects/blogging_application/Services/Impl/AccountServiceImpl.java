package com.srikar_kale.projects.blogging_application.Services.Impl;

import com.srikar_kale.projects.blogging_application.Models.Account;
import com.srikar_kale.projects.blogging_application.Repository.AccountRepository;
import com.srikar_kale.projects.blogging_application.Services.AccountService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {
    private final AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public Account saveAccount(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public Optional<Account> findByEmail(String email){
        return accountRepository.findOneByEmail(email);
    }
}
