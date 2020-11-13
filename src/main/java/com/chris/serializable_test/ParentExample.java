package com.chris.serializable_test;

import java.io.Serializable;

/**
 * Created by ye830 on 9/2/2018.
 */
public class ParentExample implements Serializable {

    private static final long serialVersionUID = 1L;

    private String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
