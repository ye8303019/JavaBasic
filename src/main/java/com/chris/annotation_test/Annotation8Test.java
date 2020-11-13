package com.chris.annotation_test;

/**
 * Created by ye830 on 4/24/2018.
 */

@MyAnnotation8(message = "I am in Annotation7Test class, I am MyAnnotation8-1")
@MyAnnotation8(message = "I am in Annotation7Test class, I am MyAnnotation8-2")
@MyAnnotation8(message = "I am in Annotation7Test class, I am MyAnnotation8-3")
public class Annotation8Test {

    @MyAnnotation8(message = "I am in Annotation7Test class - test method, I am MyAnnotation8")
    public void test(){
        System.out.println("I am Annotation8Test - test method");
    }

}
