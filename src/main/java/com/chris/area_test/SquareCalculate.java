package com.chris.area_test;

import java.math.BigDecimal;

/**
 * Created by ye830 on 3/29/2018.
 */
public class SquareCalculate implements Calculate {

    private Square square;

    public SquareCalculate(Square square){
        this.square = square;
    }

    @Override
    public BigDecimal area() {
        return this.square.getLength().multiply(this.square.getLength());
    }
}
