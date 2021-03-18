package com.chris.abstract_interface_test;

import com.chris.modifier_test.AbstractClassInheritTest;
import com.chris.modifier_test.AbstractClassTest;

/**
 * Created by ye830 on 3/16/2021.
 */
public class InterfaceImplementTest implements InterfaceTest {
    @Override
    public String getName(){
        return "Chris";
    }

    @Override
    public Integer getAge(){
        return 30;
    }

    @Override
    public String getSex(){
        return "Male";
    }

    public Integer getHeight(){
        // interface 中的 variable 只能是 public static final 的
        //height = 100;
        return height;
    }

    public static void main(String[] args) {
        InterfaceTest test = new InterfaceImplementTest();
        AbstractClassTest abstractClassTest = new AbstractClassInheritTest();
    }
}
