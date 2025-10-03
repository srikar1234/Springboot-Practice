package com.srikar_kale.projects.blogging_application.Services;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;

@Component("UserDetailService")
public interface MyUserDetailService extends UserDetailsService {
}
