package com.chris.encryption_test;



import java.io.UnsupportedEncodingException;

/**
 * encryption.Base64Test
 * <p>
 * Author: ChrisYe
 * Date: 10/8/2017
 */

public class Base64Test {

    public static void main(String... arg) throws UnsupportedEncodingException {
        String testVal = "Java";

        StringBuilder sb = new StringBuilder();
        for(byte b : testVal.getBytes()){
            sb.append(Integer.toString(b)).append(" ");
        }
        System.out.println(sb.toString());
    }

}
