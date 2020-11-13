package com.chris.algorithm_test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ye830 on 1/15/2018.
 */
public class Vampire {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int digits = sc.nextInt();
        if(digits % 2 != 0 || digits <=0){
            System.out.println("Wrong number digits!");
        }
        long h_start = 0;
        long h_end = 0;

        for(int i = 0; i < digits/2; i++){
            if(i == 0){
                h_start = 1;
            } else {
                h_start *= 10;
            }
            h_end = 10 * h_end + 9;
        }

        long start = 0;
        long end = 0;

        for(int i = 0; i < digits; i++){
            if(i == 0){
                start = 1;
            } else {
                start *= 10;
            }
            end = 10 * end + 9;
        }

        int i_count = 0;
        int r_count = 0;
        for(long i = h_start; i < h_end; i++){
            long m_start = Math.max(start/i, i+1);
            long m_end = Math.min(end/i, h_end);

            for(long j = m_start; j <= m_end; j++){

                if(i * j % 100 == 0 || (i * j - i - j) % 9 != 0){
                    continue;
                }

                i_count ++;

                long result = i * j;
                String[] r_array = String.valueOf(result).split("");
                String[] a_array = (String.valueOf(i) + String.valueOf(j)).split("");

                Arrays.sort(r_array);
                Arrays.sort(a_array);

                if(Arrays.equals(r_array, a_array)){
                    r_count ++;
                    //System.out.println(i + " * " + j + " = " + result);
                }
            }
        }
        System.out.println("Total number found:" + r_count);
        System.out.println("Total number of iterations:" + i_count);


































        //===================== my answer =====================
//        Scanner sc = new Scanner(System.in);
//        int digits = sc.nextInt();
//        if (digits % 2 != 0 || digits <= 0) {
//            System.out.println("Wrong number digits");
//            return;
//        }
//        long start = 0;
//        long end = 0;
//        for (int i = 0; i < digits; i++) {
//            if (i != 0) {
//                start = start * 10;
//            } else {
//                start = 1;
//            }
//            end = end * 10 + 9;
//        }
//
//        long half_start = 0;
//        long half_end = 0;
//        for (int i = 0; i < digits / 2; i++) {
//            if (i != 0) {
//                half_start = half_start * 10;
//            } else {
//                half_start = 1;
//            }
//            half_end = half_end * 10 + 9;
//        }
//        for (long i = half_start; i < half_end; i++) {
//            for (long j = i + 1; j < half_end; j++) {
//                if (i * j > end || i * j < start || ((i * j - i - j) % 9 != 0)) {
//                    continue;
//                }
//                long m_value = i * j;
//                String[] m_array = String.valueOf(m_value).split("");
//                String[] a_array = (String.valueOf(i) + String.valueOf(j)).split("");
//                Arrays.sort(m_array);
//                Arrays.sort(a_array);
//                if (Arrays.equals(m_array, a_array)) {
//                    System.out.println(i + " * " + j + " = " + m_value);
//                }
//            }
//        }


//        //================= right answer ===============
//        String[] ar_str1, ar_str2;
//        int sum = 0;
//        int from;
//        int to;
//        int i_val;
//        int count = 0;
//        // 双重循环穷举
//        for (int i = 10; i < 100; i++) {
//            // j=i+1避免重复
//            from = Math.max(1000 / i, i + 1);
//            to = Math.min(10000 / i, 100);
//            for (int j = from; j < to; j++) {
//                i_val = i * j;
//                // 下面的这个代码，我个人并不知道为什么，汗颜
//                if (i_val % 100 == 0 || (i_val - i - j) % 9 != 0) {
//                    continue;
//                }
//                System.out.println(i_val);
//                count++;
//                ar_str1 = String.valueOf(i_val).split("");
//                ar_str2 = (String.valueOf(i) + String.valueOf(j)).split("");
//                Arrays.sort(ar_str1);
//                Arrays.sort(ar_str2);
//                if (Arrays.equals(ar_str1, ar_str2)) {// 排序后比较,为真则找到一组
//                    sum++;
//                    System.out.println("第" + sum + "组: " + i + "*" + j + "=" + i_val);
//                }
//            }
//        }
//        System.out.println("共找到" + sum + "组吸血鬼数");
//        System.out.println(count);
    }
}
