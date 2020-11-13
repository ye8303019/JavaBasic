package com.chris.area_test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ye830 on 3/29/2018.
 */
public class Bootstrap3 {

    public void Calculate(List<Shap2> shap2s){
        for (Shap2 shap2 : shap2s){
            shap2.saySomeThing();
//            System.out.println(shap2.area());
        }
    }

    public static void main(String[] args) {
        for(String arg : args){
            System.out.println(arg);
        }
        Square2 square = new Square2(new BigDecimal(2));
        Triangle2 triangle = new Triangle2(new BigDecimal(1), new BigDecimal(1));

        List<Shap2> shap2s = Arrays.asList(square, triangle);

        Bootstrap3 bootstrap3 = new Bootstrap3();
        bootstrap3.Calculate(shap2s);

    }
}
