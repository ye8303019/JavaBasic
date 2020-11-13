package com.chris.design_pattern.decorator;

/**
 * Created by ye830 on 4/6/2018.
 */
public class MyHouse implements House {
    @Override
    public void decorate(){
        System.out.println("I buy a SONY tv ");
    }
}
