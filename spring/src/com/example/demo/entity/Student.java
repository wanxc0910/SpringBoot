package com.example.demo.entity;

import java.util.List;
import java.util.Map;

/**
 * @author ：wanxc
 * @date ：Created in 2021/3/17 20:04
 * @description：
 */
public class Student {

    private String stuName;

    private List<Course> courseList;

    private Map<String, String> map; // 测试Map集合注入

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuName='" + stuName + '\'' +
                ", courseList=" + courseList.toString() +
                ", map=" + map +
                '}';
    }
}
