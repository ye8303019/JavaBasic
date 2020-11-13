package com.chris.producer_consumer;

/**
 * Created by ye830 on 7/27/2017.
 */
public class Consumer extends Thread{

    private Integer count;

    private String name;

    private Warehouse warehouse;

    public Consumer(int count, Warehouse warehouse, String name){
        this.count = count;
        this.warehouse = warehouse;
        this.name = name;
    }

    @Override
    public void run(){
        warehouse.consume(count, name);
    }
}
