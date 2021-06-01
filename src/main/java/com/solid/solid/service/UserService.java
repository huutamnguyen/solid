package com.solid.solid.service;

import com.solid.solid.domain.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public User getUserInfo() {
        return new User();
    }

    public String generatePassword() {
        return "";
    }
}
