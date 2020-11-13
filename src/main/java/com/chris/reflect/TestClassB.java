package com.chris.reflect;

/**
 * Created by ye830 on 9/5/2017.
 */
public class TestClassB {
    public static void testMethodB(){
        System.out.println(Thread.currentThread().getStackTrace()[2].getMethodName());
    }
}
