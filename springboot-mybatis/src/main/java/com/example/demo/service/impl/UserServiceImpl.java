package com.example.demo.service.impl;

import com.example.demo.dao.UserMapper;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：wanxc
 * @date ：Created in 2021/3/10 19:46
 * @description：
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }

    @Override
    public boolean addUser(User user) {
        return userMapper.addUser(user) > 0 ? true : false;
    }

    @Override
    public boolean deleteUser(String id) {
        return userMapper.deleteUser(id) > 0 ? true : false;
    }
}
