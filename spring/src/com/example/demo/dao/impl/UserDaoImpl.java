package com.example.demo.dao.impl;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @author ：wanxc
 * @date ：Created in 2021/3/15 22:22
 * @description：
 */
@Repository // 数据访问层
public class UserDaoImpl implements UserDao {
    @Override
    public int addUser(User user) {
        return 0;
    }
}
