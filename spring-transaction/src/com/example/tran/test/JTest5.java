package com.example.tran.test;

import com.example.tran.entity.User;
import com.example.tran.service.UserService;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;


/**
 * @author ：wanxc
 * @date ：Created in 2021/4/6 21:21
 * @description：
 */
@SpringJUnitConfig(locations = "classpath:spring.xml")
public class JTest5 {
    private static final Logger LOG = LoggerFactory.getLogger(JTest5.class);

    @Autowired
    private UserService userService;

    @Test
    public void test() {
        User user = new User();
        user.setUserName("李四");
        user.setMoney(55.00);

        User user2 = new User();
        user2.setUserName("张三2");
        user2.setMoney(55.00);

        userService.transferMoney(user2, user);
    }
}
