package com.chris.assignment_test;

/**
 * Created by ye830 on 11/8/2017.
 */
public class AliasTest {

    public static void f(AssignmentEntity a){
        a.value1 = 100f;
    }

    public static void main(String[] args) {
        AssignmentEntity a1 = new AssignmentEntity(50f);

        System.out.println(a1.value1);

        f(a1);

        System.out.println(a1.value1);
    }
}
