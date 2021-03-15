package com.example.demo.service.impl;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;

/**
 * @author ：wanxc
 * @date ：Created in 2021/3/15 22:22
 * @description：
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    // 使用set方式注入外部bean
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public boolean addUser(User user) {
        return userDao.addUser(user) > 0 ? true : false;
    }
}
