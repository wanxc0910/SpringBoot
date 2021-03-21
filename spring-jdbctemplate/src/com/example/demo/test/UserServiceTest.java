package com.example.demo.test;

import com.example.demo.entity.Consumer;
import com.example.demo.service.ConsumerService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：wanxc
 * @date ：Created in 2021/3/21 20:58
 * @description：
 */
public class UserServiceTest {
    private ConsumerService consumerService() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/example/demo/spring.xml");
        ConsumerService consumerService = context.getBean("consumerService", ConsumerService.class);
        return consumerService;
    }

    @Test
    public void insertTest() {
        Consumer consumer = new Consumer();
        consumer.setUserName("test");
        consumer.setPassword("123456");

        boolean b = consumerService().addConsumer(consumer);

        System.out.println(b);
    }

    @Test
    public void queryTest() {
        // 所有行
        int allCount = consumerService().findAllCount();
        System.out.println("总数：" + allCount);
        // 所有consumer对象集合
        List<Consumer> consumerList = consumerService().findAll();

        for (Consumer consumer : consumerList
        ) {
            Integer id = consumer.getId();
            // 单笔查询
            Consumer consumer1 = consumerService().findById(id);
            System.out.println("id:" + id);
            System.out.println("name:" + consumer1.getUserName());
        }
    }

    @Test
    public void updateTest() {
        Integer id = 29;

        Consumer consumer = new Consumer();
        consumer.setId(id);
        consumer.setPhoneNum("13312345678");

        boolean b = consumerService().updateConsumer(consumer);

        if (b) {
            Consumer consumer1 = consumerService().findById(id);
            System.out.println("id:" + id);
            System.out.println("name:" + consumer1.getUserName());
            System.out.println("phoneNum:" + consumer1.getPhoneNum());
        }
    }

    @Test
    public void deleteTest() {
        Integer id = 30;

        boolean b = consumerService().deleteById(id);

        System.out.println(b);
    }

    @Test
    public void insertBatchTest() {
        List<Object[]> args = new ArrayList<>();
        Object[] os = {"test8", "123321"};
        Object[] os2 = {"test9", "567890"};
        Object[] os3 = {"test10", "123542"};

        args.add(os);
        args.add(os2);
        args.add(os3);

        boolean b = consumerService().addBatch(args);

        System.out.println(b);
    }

    @Test
    public void updateBatchTest() {
        List<Object[]> args = new ArrayList<>();
        Object[] os = {"13512345648", 37};
        Object[] os2 = {"13901267643", 38};

        args.add(os);
        args.add(os2);

        boolean b = consumerService().updateBatchByIds(args);

        System.out.println(b);
    }

    @Test
    public void deleteBatchTest() {
        List<Object[]> args = new ArrayList<>();
        Object[] os = {32};
        Object[] os2 = {34};

        args.add(os);
        args.add(os2);

        boolean b = consumerService().deleteBatchByIds(args);

        System.out.println(b);
    }
}
