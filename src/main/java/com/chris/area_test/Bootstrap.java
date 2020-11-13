package com.chris.area_test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ye830 on 3/29/2018.
 */
public class Bootstrap {

    public void calculate(List<Calculate> calculates){
        for (Calculate calculate : calculates){
            System.out.println(calculate.area());
        }
    }

    public static void main(String[] args) {
        Square square = new Square(new BigDecimal(2));
        Triangle triangle = new Triangle(new BigDecimal(1), new BigDecimal(1));

        SquareCalculate squareCalculate = new SquareCalculate(square);
        TriangleCalculate triangleCalculate = new TriangleCalculate(triangle);

        List<Calculate> calculates = Arrays.asList(squareCalculate, triangleCalculate);


        new Bootstrap().calculate(calculates);
    }
}
