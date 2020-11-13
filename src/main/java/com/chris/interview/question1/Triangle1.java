package com.chris.interview.question1;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by ye830 on 7/8/2018.
 */
public class Triangle1 extends AbstractShape {
    private double height;
    private double width;

    public Triangle1(double height, double width){
        this.height = height;
        this.width = width;
    }

    @Override
    public double area(){
        return new BigDecimal(height*width / 2).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}
