package com.example.demo.dao;

import com.example.demo.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ：wanxc
 * @date ：Created in 2021/3/10 19:45
 * @description：
 */
@Repository
public interface UserMapper {
    List<User> getAllUser();

    int addUser(User user);

    int deleteUser(String id);
}
