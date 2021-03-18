package com.example.demo.test;

import com.example.demo.entity.Course;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：wanxc
 * @date ：Created in 2021/3/15 21:05
 * @description：
 */
public class CourseTest {

    @Test
    public void test () {
        // BeanFactory加载Spring配置文件不会创建对象，在获取对象(使用)时才去创建对象
        // ApplicationContext加载Spring配置文件同时创建对象
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/example/demo/spring-bean.xml");

        Course course = context.getBean("course", Course.class);
        System.out.println("第四步：获取创建bean实例对象");
        System.out.println(course);

        context.close();
    }
}
