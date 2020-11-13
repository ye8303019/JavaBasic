package com.chris.algorithm_test;

import java.util.BitSet;

/**
 * Created by ye830 on 8/9/2017.
 */
public class ShiftOperator {
    public static void main(String[] args) {
        int number1 = 11;
        number1 = number1 << 1;
        System.out.println("Left shift: " + number1);

        int number2 = 11;
        number2 >>= 1;
        System.out.println("Right shift: " + number2);

//        int number3 = 11;
//        number3 = number3 <<< -1;
//        System.out.println("No Character Left shift: " + number3);

        int number4 = 11;
        number4 = number4 >>> 1;
        System.out.println("No Character Right shift: " + number4);

        //===============================
        System.out.println(Integer.toBinaryString(-1));
        System.out.println(Integer.toBinaryString(-1 << 33));
        System.out.println(-1 << 33);
        System.out.println(Integer.toBinaryString(-1 >> 16));
        System.out.println(Integer.toBinaryString(-1 >>> 16));
        System.out.println(-1 >>> 16);

        //===============================
        int [] array = new int [] {1,2,3,22,0,3};
        BitSet bitSet  = new BitSet(0);
        //将数组内容组bitmap
        for(int i=0;i<array.length;i++)
        {
            bitSet.set(array[i], true);
        }
        System.out.println(bitSet.size());
        System.out.println(bitSet.get(1));



        int a = 0xffffffff;
        System.out.println("Hex " + a);
        a >>= 1;
        System.out.println("Hex " + a);

        int b = 0x01;
        int c = 0x01;
        int d = 0x00;

        System.out.println("^:" + String.valueOf(a ^ d ^ c));

        System.out.println(10 % 2);

        String a1 = "a";
        switch (a1) {
            case "a": System.out.println("aaaaaa");
            case "b": System.out.println("bbbbbbb");
            default: System.out.println("haha");
        }
    }
}
