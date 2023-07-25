package com.pp.task31.dao;


import com.pp.task31.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    User index(long id);

    void createUser(User user);

    void updateUser(long id, User updatedUser);

    void deleteUser(long id);

    User findById(long id);
}
