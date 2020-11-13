package com.chris.producer_consumer;

/**
 * Created by ye830 on 7/27/2017.
 */
public class Test {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Consumer c1 = new Consumer(10, warehouse, "consumer1");
        Consumer c2 = new Consumer(10, warehouse, "consumer2");
        Producer p1 = new Producer(50, warehouse, "producer1");
        Consumer c3 = new Consumer(10, warehouse, "consumer3");
        Producer p2 = new Producer(50, warehouse, "producer2");
        Producer p3 = new Producer(50, warehouse, "producer3");

        c1.start();
        c2.start();
        p1.start();
        c3.start();
        p2.start();
        p3.start();
    }

}
