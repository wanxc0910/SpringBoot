package com.example.tran.dao;

import com.example.tran.entity.User;

/**
 * @author ：wanxc
 * @date ：Created in 2021/3/31 21:44
 * @description：
 */
public interface UserDao {
    int addMoney(User user);

    int reduceMoney(User user);
}
