package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;

/**
 * @author ：wanxc
 * @date ：Created in 2021/3/10 19:45
 * @description：
 */
public interface UserService {
    List<User> getAllUser();

    boolean addUser(User user);

    boolean deleteUser(String id);

    boolean updateUser(User user);
}
