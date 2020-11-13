package com.chris.algorithm_test;

import java.util.Scanner;

/**
 * Created by ye830 on 1/14/2018.
 */
public class Fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int digits = sc.nextInt();
        if(digits < 2){
            System.out.println("Wrong number digits!");
            return;
        }
        int above = 0;
        int below = 1;
        for(; digits > 0; digits--){
            System.out.println(above);
            int sum = below + above;
            above = below;
            below = sum;
        }













//        Scanner sc = new Scanner(System.in);
//        Integer fibonacciMeta = sc.nextInt();
//        int above = 1;
//        int below = 1;
//        for (; fibonacciMeta > 0; fibonacciMeta--) {
//            System.out.println(above);
//            int next = above + below;
//            above = below;
//            below = next;
//        }
    }
}
