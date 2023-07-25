package com.pp.task31.service;


import com.pp.task31.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User index(long id);

    void createUser(User user);

    void updateUser(long id, User updatedUser);

    void deleteUser(long id);

    User findById(long id);

}