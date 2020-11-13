package com.chris.serializable_test;

/**
 * Created by ye830 on 10/15/2018.
 */
public class JacksonNestExampleEntity {

    public JacksonNestExampleEntity(){

    }

    public JacksonNestExampleEntity(String sex){
        this.sex = sex;
    }

    private String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
