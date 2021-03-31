package com.example.tran.entity;

import org.springframework.stereotype.Component;

/**
 * @author ：wanxc
 * @date ：Created in 2021/3/31 21:47
 * @description：
 */
@Component
public class User {
    private Integer id;
    private String userName;
    private String password;
    private Double money;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}
