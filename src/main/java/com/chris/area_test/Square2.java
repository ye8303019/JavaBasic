package com.chris.area_test;

import java.math.BigDecimal;

/**
 * Created by ye830 on 3/29/2018.
 */
public class Square2 extends Shap2 {

    private BigDecimal length;

    public BigDecimal getLength() {
        return length;
    }

    public void setLength(BigDecimal length) {
        this.length = length;
    }

    public Square2(BigDecimal length){
        this.length = length;
    }

    public BigDecimal area(){
        return length.multiply(length);
    }

}
