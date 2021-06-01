package com.solid.solid.service;

import com.solid.solid.domain.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public User getUser() {
        return new User();
    }
    public User createUser() {
        return new User();
    }
    public User updateUser() {
        return new User();
    }
    public void deleteUser() {
        return;
    }

    /*
    * function encryptPassword should not be in this class
    * it should be in EncryptUtils class
    * */
    public String encryptPassword(String password) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(password);
    }
}
