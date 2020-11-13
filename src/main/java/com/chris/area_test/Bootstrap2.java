package com.chris.area_test;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import com.chris.algorithm_test.Vampire;

/**
 * Created by ye830 on 3/29/2018.
 */
public class Bootstrap2 {

    public static void main(String[] args) {
        Square square = new Square(new BigDecimal(2));
        Triangle triangle = new Triangle(new BigDecimal(1), new BigDecimal(1));

        SquareCalculate2 squareCalculate = new SquareCalculate2();

        System.out.println(squareCalculate.area(square));

        TriangleCalculate2 triangleCalculate = new TriangleCalculate2();

        System.out.println(triangleCalculate.area(triangle));


        try {
            //Square.class.getMethod("setLength", BigDecimal.class).invoke(new Square(new BigDecimal(3)), new BigDecimal(4));
            Bootstrap3.class.getMethod("main",String[].class).invoke(null, (Object)new String[]{"Ha", "Hei"});

            ClassLoader classLoader = Bootstrap3.class.getClassLoader();
            System.out.println(classLoader);
            System.out.println(classLoader.getParent());
            System.out.println(classLoader.getParent().getParent());

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        Vampire vampire = new Vampire();

        //new ClassLoader().loadClass(this.getClass().getName());
    }
}
