package com.boc.lfj.httpdemo.rx.bean;

import java.util.List;

/**
 * Created by Administrator on 2017/2/24.
 */

public class Student {
    private String name;
    private List<Course> courses;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
