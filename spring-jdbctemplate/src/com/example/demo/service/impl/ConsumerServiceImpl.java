package com.example.demo.service.impl;

import com.example.demo.dao.ConsumerDao;
import com.example.demo.entity.Consumer;
import com.example.demo.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：wanxc
 * @date ：Created in 2021/3/21 20:34
 * @description：
 */
@Service(value = "consumerService")
public class ConsumerServiceImpl implements ConsumerService {
    @Autowired
    private ConsumerDao consumerDao;

    @Override
    public boolean addConsumer(Consumer consumer) {
        return consumerDao.addConsumer(consumer) > 0 ? true : false;
    }

    @Override
    public int findAllCount() {
        return consumerDao.findAllCount();
    }

    @Override
    public List<Consumer> findAll() {
        return consumerDao.findAll();
    }

    @Override
    public Consumer findById(Integer id) {
        return consumerDao.findById(id);
    }

    @Override
    public boolean updateConsumer(Consumer consumer) {
        return consumerDao.updateConsumer(consumer) > 0 ? true : false;
    }

    @Override
    public boolean deleteById(Integer id) {
        return consumerDao.deleteById(id) > 0 ? true : false;
    }

    @Override
    public boolean addBatch(List<Object[]> args) {
        return consumerDao.addBatch(args) > 0 ? true : false;
    }

    @Override
    public boolean updateBatchByIds(List<Object[]> args) {
        return consumerDao.updateBatchByIds(args) > 0 ? true : false;
    }

    @Override
    public boolean deleteBatchByIds(List<Object[]> args) {
        return consumerDao.deleteBatchByIds(args) > 0 ? true : false;
    }
}
