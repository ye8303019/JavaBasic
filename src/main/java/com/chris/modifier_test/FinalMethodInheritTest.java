package com.chris.modifier_test;

/**
 * Created by ye830 on 3/14/2021.
 */
public class FinalMethodInheritTest extends FinalMethodTest{

    /**
     * final method 可以被重载
     * @param name
     */
    void myName(String name) {
        System.out.println(name);
        super.myName();
    }


    public static void main(String[] args) {
        FinalMethodInheritTest finalMethodInheritTest = new FinalMethodInheritTest();
        finalMethodInheritTest.myName();
        finalMethodInheritTest.myName("Tina");
    }
}
