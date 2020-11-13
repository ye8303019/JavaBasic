package com.chris.interview.question1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ye830 on 7/8/2018.
 */
public class Bootstrap3 {

    public static void main(String[] args) {

        double c1Area = calculate(() -> Math.PI * Math.pow(1, 2));

        double c2Area = calculate(() -> Math.PI * Math.pow(2, 2));

        double t1Area = calculate(() -> 1 * 2 / 2);

        double t2Area = calculate(() -> 3 * 4 / 2);

        List<Double> areaList = new ArrayList<>();

        areaList.addAll(Arrays.asList(c1Area, c2Area, t1Area, t2Area));

        areaList.forEach(System.out::println);

    }

    public static double calculate(FunctionalIShape fi) {
        return fi.area();
    }
}
