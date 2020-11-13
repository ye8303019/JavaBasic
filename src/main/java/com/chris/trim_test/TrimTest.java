package com.chris.trim_test;

/**
 * Created by ye830 on 10/29/2018.
 */
public class TrimTest {
    public static void main(String[] args) {
        String a = "\nabc\n\r";
        System.out.println(a);
        System.out.println("==============");
        String b = a.trim();
        System.out.println(b);
        System.out.println("==============");
    }
}
