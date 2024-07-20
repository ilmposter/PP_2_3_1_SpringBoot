package com.springboot.PP2_3_1_Boot.service;

import com.springboot.PP2_3_1_Boot.model.User;

import java.util.List;

public interface UserService {
    void add(User user);

    void delete(User user);

    void update(User user);

    List<User> listUsers();

    User findById(long id);
}
