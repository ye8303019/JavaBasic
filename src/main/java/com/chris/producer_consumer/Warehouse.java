package com.chris.producer_consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

/**
 * Created by ye830 on 7/27/2017.
 */
public class Warehouse {
    private static final int MAX_SIZE = 100;

    //wait & notify all
//    public List<Object> storage = new ArrayList<>();
//
//    protected void produce(int count, String name){
//        synchronized (storage) {
//            while (count + storage.size() > MAX_SIZE) {
//                try {
//                    System.out.println(String.format("Current storage is %s , %s can not put %s products to warehouse.", storage.size(), name, count));
//                    storage.wait();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//
//            for(int i = 0; i < count; i++){
//                storage.add(new Object());
//            }
//
//            storage.notifyAll();
//
//            System.out.println(String.format("%s put %s products on warehouse, current storage is %s .", name, count, storage.size()));
//        }
//    }
//
//    protected void consume(int count, String name){
//        synchronized (storage) {
//            while (storage.size() < count) {
//                try {
//                    System.out.println(String.format("Current storage is %s , %s can not consume %s products on warehouse.", storage.size(), name, count));
//                    storage.wait();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//
//            for(int i = 0; i < count; i++){
//                storage.remove(i);
//            }
//
//            storage.notifyAll();
//
//            System.out.println(String.format("%s consume %s products on warehouse, current storage is %s .", name, count, storage.size()));
//        }
//    }

    //Blocking queue
    private BlockingQueue<Object> storage = new ArrayBlockingQueue<>(MAX_SIZE);

    protected void produce(int count, String name){
        if(storage.size() == MAX_SIZE){
            System.out.println(String.format("Current storage is %s , %s can not put %s products to warehouse.", storage.size(), name, count));
        }

        for(int i = 0; i < count; i++){
            try {
                System.out.println(String.format("%s add one to warehouse.", name));
                storage.put(new Object());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    protected void consume(int count, String name){
        if(storage.size() == 0){
            System.out.println(String.format("Current storage is %s , %s can not consume %s products on warehouse.", storage.size(), name, count));
        }

        for(int i = 0; i < count; i++){
            try {
                System.out.println(String.format("%s take one to warehouse.", name));
                storage.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args){

        List<String> list = new ArrayList<>();
        for(int i = 0; i< 100; i++){
            list.add(String.valueOf((char)(new Random().nextInt(26) + 65)));
        }

        list.remove(1);
        list.remove(1);
    }

}
