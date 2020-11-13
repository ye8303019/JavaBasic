package com.chris;
import com.fasterxml.jackson.databind.ObjectMapper;

import sun.nio.ch.IOUtil;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class Main {


    public static void main(String[] args) {

//        System.out.println("Hello World!");
//
//        Integer[] memberNumber = {1,2,3,4,5,6,7};
//        List<Integer> memberList = Arrays.asList(memberNumber);
//        Collections.shuffle(memberList);
//        int i = 0;
//        for(Object member : memberList){
//            System.out.println(String.format("The %s th is No. %s",i+1, member));
//            i++;
//        }

//        System.out.println(System.getenv("JAVA_HOME"));
//
//        String a = "https://192.168.3.248:9000";
//        if(a.startsWith("http") || a.startsWith("https")){
//            a = a.replaceAll("http[s]?://","");
//            System.out.println(a);
//        }
//
//        List<String> testList = new ArrayList<>(100);
//        for(int i=0;i<100;i++){
//            testList.add(String.valueOf(i));
//        }
//        testList.add("test");
//
//        //testList = new Vector<>();
//
//
//        LinkedList<String> testList2 = new LinkedList<>(testList);
//        LinkedList<String> testList3 = (LinkedList) testList2.clone();
//        System.out.println(testList2 == testList3);
//        System.out.println(testList2.equals(testList3));
//        testList2.hashCode();

        Map<String, String> test = new HashMap<>(2);
        for(int i = 0; i<1000; i++){
            test.put(new StringBuilder("test").append(String.valueOf(i)).toString(),new StringBuilder("test").append(String.valueOf(i)).toString());
        }

        for(Map.Entry<String,String> myTest : test.entrySet()){
            System.out.println("Key:"+myTest.getKey() +" and value: "+ myTest.getValue());
        }

        System.out.println("======================================");


        for(Map.Entry<String,String> myTest : test.entrySet()){
            System.out.println("Key:"+myTest.getKey() +" and value: "+ myTest.getValue());

        }
    }
}
