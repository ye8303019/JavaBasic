package com.chris.serializable_test;

import java.io.Serializable;

/**
 * Created by ye830 on 8/31/2018.
 */
public class Example extends ParentExample implements Serializable{
    private static final long serialVersionUID = 1L;

    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
