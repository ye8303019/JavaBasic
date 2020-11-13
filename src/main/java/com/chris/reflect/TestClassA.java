package com.chris.reflect;

/**
 * Created by ye830 on 9/5/2017.
 */
public class TestClassA {

    @MyAnnotation
    public static void testMethodA(String arg1){
        TestClassB.testMethodB();
    }
}
