package com.chris.area_test;

import java.math.BigDecimal;

/**
 * Created by ye830 on 3/29/2018.
 */
public class SquareCalculate2 implements Calculate2 {

    @Override
    public BigDecimal area(Shape shape) {
        Square square = (Square) shape;
        return square.getLength().multiply(square.getLength());
    }
}
