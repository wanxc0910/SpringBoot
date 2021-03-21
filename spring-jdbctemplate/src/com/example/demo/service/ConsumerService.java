package com.example.demo.service;

import com.example.demo.entity.Consumer;

import java.util.List;

/**
 * @author ：wanxc
 * @date ：Created in 2021/3/21 20:33
 * @description：
 */
public interface ConsumerService {
    boolean addConsumer(Consumer consumer);

    int findAllCount();

    List<Consumer> findAll();

    Consumer findById(Integer id);

    boolean updateConsumer(Consumer consumer);

    boolean deleteById(Integer id);

    boolean addBatch(List<Object[]> args);

    boolean updateBatchByIds(List<Object[]> args);

    boolean deleteBatchByIds(List<Object[]> args);
}
