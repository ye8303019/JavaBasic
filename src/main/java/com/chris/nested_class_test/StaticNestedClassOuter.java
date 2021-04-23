package com.chris.nested_class_test;

/**
 * Created by ye830 on 2/22/2018.
 */
public class StaticNestedClassOuter {
    private int age = 10;

    private static int height = 180;

    public static class StaticNestedClassInner{
        private static String name = "Chris";

        public static String name_cn = "Ye Zhongkai";

        private void innerPrivateMethod (){
            System.out.println("==== Inner private Method ====");
            StaticNestedClassOuter staticNestedClassOuter = new StaticNestedClassOuter();
            System.out.println(staticNestedClassOuter.age);

            // 这段代码是会报错的，Non-static field "age" can not referenced from a static context
            // System.out.println(age);

            System.out.println(height);
        }

        private static void innerStaticMethod (){
            System.out.println("==== Inner Static Method ====");
            StaticNestedClassOuter staticNestedClassOuter = new StaticNestedClassOuter();
            System.out.println(staticNestedClassOuter.age);
            System.out.println(height);
        }
    }

    private void outterMethod(){
        System.out.println("==== Outter Private Method ====");
        System.out.println(StaticNestedClassInner.name_cn);
        System.out.println(StaticNestedClassInner.name);

    }

    public static void main(String[] args) {
        StaticNestedClassOuter staticNestedClassOuter = new StaticNestedClassOuter();
        staticNestedClassOuter.outterMethod();

        // 访问内部类的非静态方法
        new StaticNestedClassInner().innerPrivateMethod();

        // 访问内部类的静态方法
        StaticNestedClassInner.innerStaticMethod();

        // 访问内部类的私有成员变量和类成员变量，注意其他类是无法访问私有的，只有当前外部类可以访问
        System.out.println("==== How Access Nested Inner Class Object ====");
        System.out.println(StaticNestedClassInner.name_cn);
        System.out.println(StaticNestedClassInner.name);

    }
}
