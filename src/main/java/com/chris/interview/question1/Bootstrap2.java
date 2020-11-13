package com.chris.interview.question1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ye830 on 7/8/2018.
 */
public class Bootstrap2 {

    public static void main(String[] args) {
        Circular2 c1 = new Circular2(1);
        Circular2 c2 = new Circular2(2);

        Triangle2 t1 = new Triangle2(1, 2);
        Triangle2 t2 = new Triangle2(3, 4);

        List<IShape> shapes = new ArrayList<>();
        shapes.addAll(Arrays.asList(c1, c2, t1, t2));

        for(IShape shape : shapes){
            System.out.println(shape.getClass() + " Area is " + shape.area());
        }
    }
}
