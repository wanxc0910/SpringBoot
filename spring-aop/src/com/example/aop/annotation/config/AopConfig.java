package com.example.aop.annotation.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author ：wanxc
 * @date ：Created in 2021/3/29 22:09
 * @description：注解配置
 */
@Configuration
@ComponentScan(basePackages = {"com.example.aop.annotation"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AopConfig {

}
