package com.chris.annotation_test;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by ye830 on 4/23/2018.
 */

@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
@HeaderAnnotation(createBy = "ChrisYe", message = "I am above the MyAnnotation_7")
public @interface MyAnnotation7 {
    String message() default "I am MyAnnotation_7";

    @Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    @interface List {
        MyAnnotation7[] value();
    }
}
