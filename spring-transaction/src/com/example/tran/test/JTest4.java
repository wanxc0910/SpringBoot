package com.example.tran.test;

import com.example.tran.entity.User;
import com.example.tran.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author ：wanxc
 * @date ：Created in 2021/4/6 21:21
 * @description：
 */
@RunWith(SpringJUnit4ClassRunner.class) // 单元测试框架
@ContextConfiguration("classpath:spring.xml") // 加载配置文件
public class JTest4 {
    private static final Logger LOG = LoggerFactory.getLogger(JTest4.class);

    @Autowired
    private UserService userService;

    @Test
    public void test() {
        User user = new User();
        user.setUserName("张三2");
        user.setMoney(55.00);

        User user2 = new User();
        user2.setUserName("李四");
        user2.setMoney(55.00);

        userService.transferMoney(user2, user);
    }
}
