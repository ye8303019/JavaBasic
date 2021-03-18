package com.chris.abstract_interface_test;

/**
 * Created by ye830 on 3/16/2021.
 * Abstract class 可以 extends 其他类 也可以 implement 其他 interface
 */
public abstract class AbstractTest extends AbstractChildTest implements InterfaceTest {

    public String nickName = "Chris";

    @Override
    public String getName(){
        return "Chris";
    }

    @Override
    public abstract String getSex();


    /**
     * Abstract class 可以包含各类修饰符的 method
     * @return
     */
    private Integer getHeight(){
        return 180;
    }

}
