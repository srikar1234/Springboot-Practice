package com.srikar_kale.projects.blogging_application.Services;

import com.srikar_kale.projects.blogging_application.Models.Account;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface AccountService {

    Account saveAccount(Account account);
    Optional<Account>findByEmail(String emailId);
}
