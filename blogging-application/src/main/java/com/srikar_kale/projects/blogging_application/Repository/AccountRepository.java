package com.srikar_kale.projects.blogging_application.Repository;

import com.srikar_kale.projects.blogging_application.Models.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
    Optional<Account>findOneByEmail(String email);
}
