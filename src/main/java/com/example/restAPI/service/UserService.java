package com.example.restAPI.service;

import com.example.restAPI.model.User;

import java.util.List;

public interface UserService {

    User save(User user);
    List<User> findAll();
    void delete(long id);
}
