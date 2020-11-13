package com.chris.area_test;

import java.math.BigDecimal;

/**
 * Created by ye830 on 3/29/2018.
 */
public class Triangle2 extends Shap2 {
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

    public Triangle2(BigDecimal length, BigDecimal height){
        this.length = length;
        this.height = height;
    }

    public BigDecimal area(){
        return length.multiply(height).divide(new BigDecimal(2));
    }
}
