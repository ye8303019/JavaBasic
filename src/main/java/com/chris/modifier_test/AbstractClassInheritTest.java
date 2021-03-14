package com.chris.modifier_test;

/**
 * Created by ye830 on 3/14/2021.
 */
public class AbstractClassInheritTest extends AbstractClassTest{

    @Override
    public String myName(){
        String name = "Chris";
        System.out.println(name);
        return name;
    }

    public static void main(String[] args) {
        AbstractClassInheritTest abstractClassInheritTest = new AbstractClassInheritTest();
        abstractClassInheritTest.myName();
        abstractClassInheritTest.myName("Tina");
    }
}
