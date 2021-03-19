package com.example.demo.test;

import com.example.demo.config.SpringConfig;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import com.example.demo.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：wanxc
 * @date ：Created in 2021/3/15 21:05
 * @description：
 */
public class UserTest {

    @Test
    public void test () {
        // BeanFactory加载Spring配置文件不会创建对象，在获取对象(使用)时才去创建对象
        // ApplicationContext加载Spring配置文件同时创建对象
        ApplicationContext context = new ClassPathXmlApplicationContext("com/example/demo/spring.xml");

        // 创建user对象
        User user = context.getBean("user", User.class);
        System.out.println(user);

        // 外部bean注入测试
        UserService userService = context.getBean("userService", UserServiceImpl.class);
        boolean rs = userService.addUser(user);
        System.out.println(rs);
    }

    @Test
    public void testAnnotation () {
        // BeanFactory加载Spring配置文件不会创建对象，在获取对象(使用)时才去创建对象
        // ApplicationContext加载Spring配置文件同时创建对象
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        // 创建user对象
        User user = context.getBean("user", User.class);
        System.out.println(user);

        // 外部bean注入测试
        UserService userService = context.getBean("userService", UserServiceImpl.class);
        boolean rs = userService.addUser(user);
        System.out.println(rs);
    }
}
