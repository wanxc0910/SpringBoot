package com.example.tran.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author ：wanxc
 * @date ：Created in 2021/3/31 21:17
 * @description：
 */
@Configuration // 声明为配置类
@ComponentScan(basePackages = {"com.example.tran"}) // 开启注解扫描
@EnableTransactionManagement // 开启事务
public class SpringConfig {
    /**
     * 数据连接池
     *
     * @return
     * @throws IOException
     */
    @Bean
    public DruidDataSource getDruidDataSource() throws IOException {
        InputStream inputStream = ClassLoader.getSystemClassLoader().getResourceAsStream("jdbc.properties");
        Properties properties = new Properties();
        properties.load(inputStream);
        String driveClass = properties.getProperty("prop.driveClass");
        String url = properties.getProperty("prop.url");
        String username = properties.getProperty("prop.username");
        String password = properties.getProperty("prop.password");

        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(driveClass);
        druidDataSource.setUrl(url);
        druidDataSource.setUsername(username);
        druidDataSource.setPassword(password);

        return druidDataSource;
    }

    /**
     * JdbcTemplate
     *
     * @param dataSource
     * @return
     */
    @Bean
    public JdbcTemplate getJdbcTemplate(DataSource dataSource) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }

    /**
     * 事务管理器
     *
     * @param dataSource
     * @return
     */
    @Bean
    public DataSourceTransactionManager getDataSourceTransactionManager(DataSource dataSource) {
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSource);
        return dataSourceTransactionManager;
    }
}
