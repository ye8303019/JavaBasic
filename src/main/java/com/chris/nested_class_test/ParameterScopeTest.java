package com.chris.nested_class_test;

/**
 * Created by ye830 on 2/22/2018.
 */
public class ParameterScopeTest {
    private int age = 10;

    private class InnerClass {
        private int age = 20;

        private void innerMethod(){
            int age = 30;
            System.out.println(age);
            System.out.println(this.age);
            System.out.println(ParameterScopeTest.this.age);
        }
    }

    public static void main(String[] args) {
        ParameterScopeTest parameterScopeTest = new ParameterScopeTest();
        InnerClass innerClass = parameterScopeTest.new InnerClass();
        innerClass.innerMethod();
    }
}
