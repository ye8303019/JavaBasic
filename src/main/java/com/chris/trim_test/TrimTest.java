package com.chris.trim_test;

import com.chris.time_test.TimeTest;

/**
 * Created by ye830 on 10/29/2018.
 */
public class TrimTest {

    private int age = 10;

    public static void main(String[] args) {
        String a = "\nabc\n\r";
        System.out.println(a);
        System.out.println("==============");
        String b = a.trim();
        System.out.println(b);
        System.out.println("==============");
    }
}
