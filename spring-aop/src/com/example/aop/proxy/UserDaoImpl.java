package com.example.aop.proxy;

/**
 * @author ：wanxc
 * @date ：Created in 2021/3/24 21:38
 * @description：
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("添加");
    }

    @Override
    public void update() {
        System.out.println("修改");
    }
}
