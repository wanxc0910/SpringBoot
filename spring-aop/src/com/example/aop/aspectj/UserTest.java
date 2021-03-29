package com.example.aop.aspectj;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：wanxc
 * @date ：Created in 2021/3/29 21:06
 * @description：
 */
public class UserTest {
    @Test
    public void userProxyTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/example/aop/spring-aop.xml");
        UserDao userDao = context.getBean("userDao", UserDao.class);
        userDao.add();
    }
}
