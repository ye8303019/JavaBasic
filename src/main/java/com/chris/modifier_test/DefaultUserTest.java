package com.chris.modifier_test;

/**
 * Created by ye830 on 3/14/2021.
 */
public class DefaultUserTest {

    DefaultProviderTest defaultProviderTest = new DefaultProviderTest();
    DefaultProviderTest defaultProviderChildTest = new DefaultProviderTest();

    public DefaultUserTest(){
        this.defaultProviderTest.setName("Chris");
        this.defaultProviderChildTest.setName("Tina");
    }

    private void printName(){
        System.out.println(defaultProviderTest.getName());
    }

    private void printChildName(){
        System.out.println(defaultProviderChildTest.getName());
    }

    public static void main(String[] args) {
        DefaultUserTest defaultUserTest = new DefaultUserTest();
        defaultUserTest.printName();
        defaultUserTest.printChildName();
    }
}
