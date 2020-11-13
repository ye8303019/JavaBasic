package com.chris.interview.question1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ye830 on 7/8/2018.
 */
public class Bootstrap1 {

    public static void main(String[] args) {
        Circular1 c1 = new Circular1(1);
        Circular1 c2 = new Circular1(2);

        Triangle1 t1 = new Triangle1(1, 2);
        Triangle1 t2 = new Triangle1(3, 4);

        List<AbstractShape> shapes = new ArrayList<>();
        shapes.addAll(Arrays.asList(c1, c2, t1, t2));

        for(AbstractShape shape : shapes){
            System.out.println(shape.getClass() + " Area is " + shape.area());
        }
    }
}
