package com.chris.assignment_test;

/**
 * Created by ye830 on 11/8/2017.
 */
public class AssignmentTest {
    public static void main(String[] args) {
        AssignmentEntity a1 = new AssignmentEntity(10f);
        AssignmentEntity a2 = new AssignmentEntity(20f);

        System.out.println("a1.value1 = " + a1.getValue1() + " a2.value1 = " + a2.value1);

        a1 = a2;

        a1.value1 = 30f;

        System.out.println("a1.value1 = " + a1.getValue1() + " a2.value1 = " + a2.value1);
    }
}
