package com.chris.equals_test;

import java.util.Random;

/**
 * Created by ye830 on 11/14/2017.
 */
public class EqualsTest {
    static class Dog{

        public Dog(String name, String says){
            this.name = name;
            this.says = says;
        }

        private String name;
        private String says;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSays() {
            return says;
        }

        public void setSays(String says) {
            this.says = says;
        }
    }

    public static void main(String[] args) {

        Random r = new Random(47);
        Random r1 = new Random();

        System.out.println(r.nextInt(100));
        System.out.println(r.nextInt(100));

        System.out.println(r1.nextInt(100));
        System.out.println(r1.nextInt(100));

        Dog d1 = new Dog("spot","Ruff");
        Dog d2 = new Dog("scruffy","Wurf");
        Dog d3 = d1;

        System.out.println(d1 == d2);

        System.out.println(d1.equals(d2));

        System.out.println(d1.equals(d3));

    }
}
