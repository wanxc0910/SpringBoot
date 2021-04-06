package com.example.tran.test;

import com.example.tran.config.SpringConfig;
import com.example.tran.dao.UserDao;
import com.example.tran.dao.impl.UserDaoImpl;
import com.example.tran.entity.User;
import com.example.tran.service.UserService;
import com.example.tran.service.impl.UserServiceImpl;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ：wanxc
 * @date ：Created in 2021/3/31 22:05
 * @description：
 */
public class UserTest {
    private static final Logger LOG = LoggerFactory.getLogger(UserTest.class);

    @Test
    public void test() {
        LOG.info("test");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        context.getBean("userService", UserService.class);
        UserService userService = (UserService) context.getBean("userService");

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
