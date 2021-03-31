package com.example.tran.dao.impl;

import com.example.tran.dao.UserDao;
import com.example.tran.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author ：wanxc
 * @date ：Created in 2021/3/31 21:53
 * @description：
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int addMoney(User user) {
        String sql = "update tb_user set money=money+? where user_name=?";
        Object[] args = {user.getMoney(), user.getUserName()};
        return jdbcTemplate.update(sql, args);
    }

    @Override
    public int reduceMoney(User user) {
        String sql = "update tb_user set money=money-? where user_name=?";
        Object[] args = {user.getMoney(), user.getUserName()};
        return jdbcTemplate.update(sql, args);
    }
}
