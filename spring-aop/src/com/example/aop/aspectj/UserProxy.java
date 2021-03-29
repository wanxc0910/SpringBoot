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
@Order(2) // Order执行优先级，值越小优先级越高(数值类型)
public class UserProxy {
    /**
     * @Before 前置通知，被增强方法执行前执行
     */
    //@Before(value = "execution(* com.example.aop.aspectj.UserDaoImpl.add(..))")
    @Before(value = "pointcutBase()")
    public void before() {
        System.out.println("UserProxy before...");
    }

    /**
     * @After 后置通知，被增强方法执行后执行
     */
    //@After(value = "execution(* com.example.aop.aspectj.UserDaoImpl.add(..))")
    @After(value = "pointcutBase()")
    public void after() {
        System.out.println("UserProxy after...");
    }

    /**
     * @AfterReturning 返回通知
     */
    @AfterReturning(value = "execution(* com.example.aop.aspectj.UserDaoImpl.add(..))")
    public void afterReturning() {
        System.out.println("UserProxy afterReturning...");
    }

    /**
     * @Around 环绕通知
     */
    @Around(value = "execution(* com.example.aop.aspectj.UserDaoImpl.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("UserProxy around...环绕前");

        proceedingJoinPoint.proceed();

        System.out.println("UserProxy around...环绕后");
    }

    /**
     * @AfterThrowing 异常通知
     */
    @AfterThrowing(value = "execution(* com.example.aop.aspectj.UserDaoImpl.add(..))")
    public void afterThrowing() {
        System.out.println("UserProxy afterThrowing...");
    }

    /**
     * @Pointcut 提取
     */
    @Pointcut(value = "execution(* com.example.aop.aspectj.UserDaoImpl.add(..))")
    public void pointcutBase() {

    }
}
