package com.chris.static_test.store_test;

/**
 * The test present static parameter will be initialized when the class load ready, also the static
 * store resource store in the static storage space, each static resource only have one global copy
 *
 */
public class StaticStoreTest {

    private static String name = "Chris";

    public StaticStoreTest(){
        System.out.println(name);
    }

    public static void test(String myName) {
        String myNickName = myName;
        System.out.println("My Nic Name is :" + myNickName);
        name = myName;
    }

    public static void sayMyName() {
        System.out.println("My Name is :" + name);
    }

    public static void main(String[] args) {

        new StaticStoreTest();

        StaticStoreTest.sayMyName();

        StaticStoreTest.test("Ye");

        StaticStoreTest.test("ZK");

        StaticStoreTest.sayMyName();

        //new StaticA().sayMyName();
    }
}
