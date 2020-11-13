package com.chris.area_test;

import java.math.BigDecimal;

/**
 * Created by ye830 on 3/29/2018.
 */
public class Triangle extends Shape {
    public BigDecimal getLength() {
        return length;
    }

    public void setLength(BigDecimal length) {
        this.length = length;
    }

    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    private BigDecimal length;
    private BigDecimal height;

    public Triangle(BigDecimal length, BigDecimal height){
        this.length = length;
        this.height = height;
    }


}
