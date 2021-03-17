package com.example.demo.test;

import com.example.demo.entity.Book;
import com.example.demo.entity.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：wanxc
 * @date ：Created in 2021/3/15 21:05
 * @description：
 */
public class StudentTest {

    @Test
    public void test () {
        // BeanFactory加载Spring配置文件不会创建对象，在获取对象(使用)时才去创建对象
        // ApplicationContext加载Spring配置文件同时创建对象
        ApplicationContext context = new ClassPathXmlApplicationContext("com/example/demo/spring.xml");

        Student student = context.getBean("student", Student.class);

        System.out.println(student);
    }
}
