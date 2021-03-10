package com.example.demo.entity;

import java.io.Serializable;

/**
 * @author ：wanxc
 * @date ：Created in 2021/3/10 19:39
 * @description：
 */
public class User implements Serializable {

    private String id;

    private String userName;

    private String password;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
}
