package com.chris.interview.question2;

import java.util.Arrays;
import java.util.Stack;

/**
 * Created by ye830 on 7/8/2018.
 */
public class Bootstrap {

    static int[] start = {0, 0};
    static int[] end = {6, 6};
    static int[][] block = {
            {0, 1}, {0, 5}, {0, 6},
            {1, 2}, {1, 3},
            {2, 0}, {2, 3}, {2, 5},
            {3, 2}, {3, 5},
            {4, 1}, {4, 4}, {4, 5},
            {5, 3},
            {6, 1}, {6, 3}, {6, 5}
    };

    static Stack<int[]> path = new Stack();

    public static void main(String[] args) {
        System.out.println("I am start from " + start[0] + " " + start[1]);
        move(start, start);
        System.out.println("I am out.");
    }

    public static void move(int[] point, int[] prePoint) {
        if (Arrays.equals(point, end)) {
            System.out.println(point[0] + " " + point[1]);
            return;
        } else {
            boolean move = false;
            int[] nextPoint = new int[]{point[0] + 1, point[1]};
            if (validate(nextPoint, prePoint)) {
                move = true;
            } else {
                nextPoint = new int[]{point[0], point[1] + 1};
                if (validate(nextPoint, prePoint)) {
                    move = true;
                } else {
                    nextPoint = new int[]{point[0] - 1, point[1]};
                    if (validate(nextPoint, prePoint)) {
                        move = true;
                    } else {
                        nextPoint = new int[]{point[0], point[1] - 1};
                        if (validate(nextPoint, prePoint)) {
                            move = true;
                        }
                    }
                }
            }
            if (move) {
                path.push(point);
                System.out.print(point[0] + " " + point[1] + "-> ");
                move(nextPoint, point);
            } else {
                move(path.pop(), point);
            }
        }
    }

    public static boolean contain(int[][] source, int[] point) {
        for (int[] blockPoint : source) {
            if (blockPoint[0] == point[0] && blockPoint[1] == point[1]) {
                return true;
            }
        }
        return false;
    }

    public static boolean validate(int[] nextPoint, int[] prePoint){
        if (!Arrays.equals(nextPoint, prePoint)
                && !path.contains(nextPoint)
                && !contain(block, nextPoint)
                && nextPoint[0] <= end[0]
                && nextPoint[1] <= end[1]
                && nextPoint[0] >= start[0]
                && nextPoint[1] >= start[1]) {
            return true;
        } else {
            return false;
        }
    }
}
