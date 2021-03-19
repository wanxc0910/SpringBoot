package com.example.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author ：wanxc
 * @date ：Created in 2021/3/19 21:49
 * @description：
 */
@Configuration // 作为配置类，替换xml配置文件
@ComponentScan(basePackages = {"com.example.demo"})
public class SpringConfig {
    // @Controll 表示层
    // @Service 业务逻辑层
    // @Repository 数据访问层
    // @Component
}
