package com.chris.area_test;

import java.math.BigDecimal;

/**
 * Created by ye830 on 3/29/2018.
 */
public class Square extends Shape {

    private BigDecimal length;

    public BigDecimal getLength() {
        return length;
    }

    public void setLength(BigDecimal length) {
        System.out.println("1 Square length is:" + this.length);
        this.length = length;
        System.out.println("2 Square length is:" + this.length);
    }

    public Square(BigDecimal length){
        this.length = length;
    }



}
