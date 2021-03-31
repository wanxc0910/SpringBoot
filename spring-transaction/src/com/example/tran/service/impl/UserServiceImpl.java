package com.example.tran.service.impl;

import com.example.tran.dao.UserDao;
import com.example.tran.entity.User;
import com.example.tran.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author ：wanxc
 * @date ：Created in 2021/3/31 21:04
 * @description：
 */
@Service(value = "userService")
@Transactional // 开启事务
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public boolean transferMoney(User user, User user2) {
        int a = userDao.addMoney(user);
        int b = userDao.reduceMoney(user2);

        return (a + b) == 2 ? true : false;
    }
}
