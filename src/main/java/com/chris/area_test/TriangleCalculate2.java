package com.chris.area_test;

import java.math.BigDecimal;

/**
 *
 * @author ye830
 * @date 3/29/2018
 */
public class TriangleCalculate2 implements Calculate2 {


    @Override
    public BigDecimal area(Shape shape) {
        Triangle triangle = (Triangle)shape;
        return triangle.getLength().multiply(triangle.getHeight()).divide(new BigDecimal(2));
    }
}
