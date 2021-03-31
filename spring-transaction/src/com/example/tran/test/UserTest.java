package com.example.tran.test;

import com.example.tran.config.SpringConfig;
import com.example.tran.entity.User;
import com.example.tran.service.UserService;
import com.example.tran.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import sun.net.www.content.text.Generic;

/**
 * @author ：wanxc
 * @date ：Created in 2021/3/31 22:05
 * @description：
 */
public class UserTest {
    @Test
    public void test() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        context.getBean("userService", UserService.class);
        UserService userService = (UserService)context.getBean("userService");

        Double money = 55.00;

        User user = new User();
        user.setUserName("李四");
        user.setMoney(money);

        User user2 = new User();
        user2.setUserName("张三2");
        user2.setMoney(money);

        userService.transferMoney(user2, user);
    }
}
