package com.chris.area_test;

import java.math.BigDecimal;

/**
 * Created by ye830 on 3/29/2018.
 */
public abstract class Shap2 {

    public void saySomeThing(){
        System.out.println(area());
    }

    public abstract BigDecimal area();
}
