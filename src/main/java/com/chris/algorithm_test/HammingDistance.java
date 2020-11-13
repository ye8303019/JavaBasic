package com.chris.algorithm_test;

/**
 * Created by ye830 on 6/13/2018.
 * Reference: https://blog.csdn.net/u012351768/article/details/75530299
   Hamming Distance means the differernt binary digitals between two numbers
   Need to use bitwise XOR and n & n-1
 */
public class HammingDistance {
    public static void main(String[] args) {
        System.out.println(hammingDistance(3,16));
    }

    public static int hammingDistance(int x, int y){
        int z = x ^ y;
        int count = 0;
        while(z > 0){
            z &= (z-1);
            count++;
        }
        return count;
    }
}
