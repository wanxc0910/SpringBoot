package com.example.aop.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author ：wanxc
 * @date ：Created in 2021/3/29 20:20
 * @description：
 */
@Component
@Aspect // 创建代理对象
@Order(3)
public class PersonProxy {
    /**
     * @Before 前置通知，被增强方法执行前执行
     */
    @Before(value = "execution(* com.example.aop.aspectj.UserDaoImpl.add(..))")
    public void before() {
        System.out.println("PersonProxy before...");
    }
}
