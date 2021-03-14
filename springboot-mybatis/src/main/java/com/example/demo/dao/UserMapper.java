package com.example.demo.dao;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;
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

    /**
     * 修改用户名
     *
     * @param user
     * @return
     */
    @Update("update tb_user set user_name=#{userName,jdbcType=VARCHAR} where id=#{id,jdbcType=VARCHAR}")
    int updateUser(User user);
}
