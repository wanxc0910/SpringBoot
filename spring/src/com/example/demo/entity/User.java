package com.example.demo.entity;

/**
 * @author ：wanxc
 * @date ：Created in 2021/3/15 21:01
 * @description：
 */
public class User {
    private String userName;

    private String sex;

    private int age;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
