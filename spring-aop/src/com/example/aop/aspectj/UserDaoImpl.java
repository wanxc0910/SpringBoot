package com.example.aop.aspectj;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author ：wanxc
 * @date ：Created in 2021/3/29 20:19
 * @description：
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("User add...");
    }
}
