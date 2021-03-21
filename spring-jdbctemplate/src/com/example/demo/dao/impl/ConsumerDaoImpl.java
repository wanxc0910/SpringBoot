package com.example.demo.dao.impl;

import com.example.demo.dao.ConsumerDao;
import com.example.demo.entity.Consumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ：wanxc
 * @date ：Created in 2021/3/21 20:38
 * @description：
 */
@Repository
public class ConsumerDaoImpl implements ConsumerDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 新增单笔记录
     *
     * @param consumer
     * @return
     */
    @Override
    public int addConsumer(Consumer consumer) {
        String sql = "insert into consumer(username,password) value(?,?)";
        String[] args = {consumer.getUserName(), consumer.getPassword()};
        return jdbcTemplate.update(sql, args);
    }

    /**
     * 获取行数
     *
     * @return
     */
    @Override
    public int findAllCount() {
        String sql = "select count(*) from consumer";
        return jdbcTemplate.queryForObject(sql, int.class);
    }

    /**
     * 查询所有consumer记录信息
     *
     * @return
     */
    @Override
    public List<Consumer> findAll() {
        String sql = "select * from consumer";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Consumer>(Consumer.class));
    }

    /**
     * 根据id获取单笔consumer记录信息
     *
     * @param id
     * @return
     */
    @Override
    public Consumer findById(Integer id) {
        String sql = "select * from consumer where id=?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Consumer>(Consumer.class), id);
    }

    /**
     * 根据id修改手机号
     *
     * @param consumer
     * @return
     */
    @Override
    public int updateConsumer(Consumer consumer) {
        String sql = "update consumer set phone_num=? where id=?";
        Object[] objects = {consumer.getPhoneNum(), consumer.getId()};
        return jdbcTemplate.update(sql, objects);
    }

    /**
     * 根据id删除单笔记录
     *
     * @param id
     * @return
     */
    @Override
    public int deleteById(Integer id) {
        String sql = "delete from consumer where id=?";
        return jdbcTemplate.update(sql, id);
    }

    /**
     * 批量添加
     *
     * @param args
     * @return
     */
    @Override
    public int addBatch(List<Object[]> args) {
        int res = 0;

        String sql = "insert into consumer(username,password) value(?,?)";

        int[] ints = jdbcTemplate.batchUpdate(sql, args);

        for (int count : ints) {
            res += count;
        }

        return res;
    }

    /**
     * 批量修改
     *
     * @param args
     * @return
     */
    @Override
    public int updateBatchByIds(List<Object[]> args) {
        int res = 0;

        String sql = "update consumer set phone_num=? where id=?";

        int[] ints = jdbcTemplate.batchUpdate(sql, args);

        for (int count : ints) {
            res += count;
        }

        return res;
    }

    /**
     * 批量删除
     *
     * @param args
     * @return
     */
    @Override
    public int deleteBatchByIds(List<Object[]> args) {
        int res = 0;

        String sql = "delete from consumer where id=?";

        int[] ints = jdbcTemplate.batchUpdate(sql, args);

        for (int count : ints) {
            res += count;
        }

        return res;
    }
}
