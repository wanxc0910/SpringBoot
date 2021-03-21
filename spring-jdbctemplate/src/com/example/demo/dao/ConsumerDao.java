package com.example.demo.dao;

import com.example.demo.entity.Consumer;

import java.util.List;

/**
 * @author ：wanxc
 * @date ：Created in 2021/3/21 20:37
 * @description：
 */
public interface ConsumerDao {
    int addConsumer(Consumer consumer);

    int findAllCount();

    List<Consumer> findAll();

    Consumer findById(Integer id);

    int updateConsumer(Consumer consumer);

    int deleteById(Integer id);

    int addBatch(List<Object[]> args);

    int updateBatchByIds(List<Object[]> args);

    int deleteBatchByIds(List<Object[]> args);
}
