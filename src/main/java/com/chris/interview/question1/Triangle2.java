package com.chris.interview.question1;

/**
 * Created by ye830 on 7/8/2018.
 */
public class Triangle2 implements IShape {
    private double height;
    private double width;

    public Triangle2(double height, double width){
        this.height = height;
        this.width = width;
    }

    @Override
    public double area(){
        return height*width / 2;
    }
}
