package com.chris.abstract_interface_test;

/**
 * Created by ye830 on 3/16/2021.
 */
public class AbstractImplementTest extends AbstractTest {
    @Override
    public String getName(){
        return "Chris";
    }

    @Override
    public String getSex(){
        return "male";
    }

    @Override
    public Integer getAge(){
        return 30;
    }

    public String getNickName(){
        return nickName;
    }

}
