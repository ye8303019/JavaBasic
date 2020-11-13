package com.chris.interview.question1;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by ye830 on 7/8/2018.
 */
public class Circular1 extends AbstractShape{

    private double radius;

    public Circular1(double radius){
        this.radius = radius;
    }


    @Override
    public double area(){
        return new BigDecimal(Math.pow(radius, 2) * Math.PI).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}
