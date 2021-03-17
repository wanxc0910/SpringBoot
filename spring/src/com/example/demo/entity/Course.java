package com.example.demo.entity;

/**
 * @author ：wanxc
 * @date ：Created in 2021/3/17 20:04
 * @description：
 */
public class Course {
    private String courseName;

    /**
     * 无参构造
     */
    public Course() {
        System.out.println("第一步：bean实例化");
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
        System.out.println("第二步：set方式注入属性值");
    }

    /**
     * 初始化方法
     */
    public void initMethod() {
        System.out.println("第三步：执行初始化方法");
    }

    /**
     * 销毁方法
     */
    public void destroyMethod() {
        System.out.println("第五步：执行销毁方法");
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                '}';
    }
}
