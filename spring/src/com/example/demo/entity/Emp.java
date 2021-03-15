package com.example.demo.entity;

/**
 * @author ：wanxc
 * @date ：Created in 2021/3/15 22:09
 * @description：
 */
public class Emp {
    private String empName;

    private String sex;

    private Dept dept; // 一个部门，多名员工

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empName='" + empName + '\'' +
                ", sex='" + sex + '\'' +
                ", dept=" + dept.toString() +
                '}';
    }
}
