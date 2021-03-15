package com.example.demo.entity;

/**
 * @author ：wanxc
 * @date ：Created in 2021/3/15 22:09
 * @description：
 */
public class Dept {
    private String deptName;

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptName='" + deptName + '\'' +
                '}';
    }
}
