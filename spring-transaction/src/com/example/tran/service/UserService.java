package com.example.tran.service;

import com.example.tran.entity.User;

/**
 * @author ：wanxc
 * @date ：Created in 2021/3/31 21:04
 * @description：
 */
public interface UserService {
    boolean transferMoney(User user, User user2);
}
