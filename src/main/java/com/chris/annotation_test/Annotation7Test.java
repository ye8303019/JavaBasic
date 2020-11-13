package com.chris.annotation_test;

/**
 * Created by ye830 on 4/24/2018.
 */

@MyAnnotation7.List({
        @MyAnnotation7(message = "I am in Annotation7Test class, I am MyAnnotation7-1"),
        @MyAnnotation7(message = "I am in Annotation7Test class, I am MyAnnotation7-2"),
        @MyAnnotation7(message = "I am in Annotation7Test class, I am MyAnnotation7-3")
})
public class Annotation7Test {

}
