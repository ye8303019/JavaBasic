package com.chris.interview.question1;

/**
 * Created by ye830 on 7/8/2018.
 */
public class Circular2 implements IShape{

    private double radius;

    public Circular2(double radius){
        this.radius = radius;
    }


    @Override
    public double area(){
        return Math.pow(radius, 2) * Math.PI;
    }
}
