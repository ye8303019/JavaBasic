package com.chris.area_test;

import java.math.BigDecimal;

/**
 *
 * @author ye830
 * @date 3/29/2018
 */
public class TriangleCalculate implements Calculate {

    private Triangle triangle;

    public TriangleCalculate(Triangle triangle){
        this.triangle = triangle;
    }

    @Override
    public BigDecimal area() {
        return this.triangle.getLength().multiply(this.triangle.getHeight()).divide(new BigDecimal(2));
    }
}
