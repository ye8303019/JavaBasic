package com.chris.algorithm_test;

import java.math.BigInteger;

/**
 * Created by ye830 on 6/13/2018.
 */
public class Bitwise {
    public static void main(String[] args) {
        int a = 3, b = 5;
        //a =  11
        //b = 101
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(~a);
        System.out.println(a^b);

        String s = "abcd";

        s.hashCode();

        byte[] by = s.getBytes();

        byte bb = 111;

        System.out.println(bb);

        char cc = 'c';
        char dd = 'd';

        int ee = cc+dd;

        System.out.println(ee);

        Character c = new Character('c');


        String ss = "a";
        byte[] bytes = ss.getBytes();

        System.out.println("将woaini转为不同进制的字符串：");
        System.out.println("可以转换的进制范围：" + Character.MIN_RADIX + "-" + Character.MAX_RADIX);
        System.out.println("2进制："   + binary(bytes, 10));
        System.out.println("5进制："   + binary(bytes, 5));
        System.out.println("8进制："   + binary(bytes, 8));
        System.out.println("16进制："  + binary(bytes, 16));
        System.out.println("32进制："  + binary(bytes, 32));
        System.out.println("64进制："  + binary(bytes, 64));// 这个已经超出范围，超出范围后变为10进制显示


    }

    public static String binary(byte[] bytes, int radix){
        return new BigInteger(1, bytes).toString(radix);// 这里的1代表正数
    }
}