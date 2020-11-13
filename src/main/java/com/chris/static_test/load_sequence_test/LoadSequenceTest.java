package com.chris.static_test.load_sequence_test;

/**
 * <p>The test present that the load sequence strategy of java
 * <p> load class -> static initialize -> constructor
 */
public class LoadSequenceTest extends LoadSequenceBase{

    private static String name = "Chris";

    static {
        System.out.println("I am in LoadSequenceTest static code block");
    }

    public LoadSequenceTest(){
        System.out.println(name);
        System.out.println("I am in LoadSequenceTest constructor");
    }

    public void test(){
        System.out.println("I am in test method, this method is non-static");
    }

    public static void main(String[] args) {
        new LoadSequenceTest();
        new LoadSequenceTest().test();
    }
}
