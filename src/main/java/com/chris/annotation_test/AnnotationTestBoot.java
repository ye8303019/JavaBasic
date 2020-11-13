package com.chris.annotation_test;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Created by ye830 on 4/24/2018.
 */
public class AnnotationTestBoot {
    public static void main(String[] args) {
        Annotation[] annotations7 = Annotation7Test.class.getAnnotations();
        Arrays.stream(annotations7).forEach(annotation -> {
            if(annotation.annotationType().equals(MyAnnotation7.List.class)){
                Arrays.stream(((MyAnnotation7.List)annotation).value()).forEach(child -> {
                    System.out.println(child.message());
                });
            }
        });


        Annotation[] annotations8 = Annotation8Test.class.getAnnotations();
        Arrays.stream(annotations8).forEach(annotation -> {
            if(annotation.annotationType().equals(MyAnnotation8.List.class)){
                Arrays.stream(((MyAnnotation8.List)annotation).value()).forEach(child -> {
                    System.out.println(child.message());
                });
            }
        });

        Method[] method8 = Annotation8Test.class.getMethods();
        Arrays.stream(method8).forEach(method -> {
            if("test".equals(method.getName())){
                Arrays.stream(method.getAnnotationsByType(MyAnnotation8.class)).forEach(child -> {
                    System.out.println(child.message());
                });

                try {
                    method.invoke(Annotation8Test.class.getConstructor().newInstance(), null);
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
