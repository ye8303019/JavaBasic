package com.chris.this_test;

/**
 * Created by ye830 on 1/17/2018.
 */
public class PassingThis {
    public static void main(String[] args) {
        new Person().eat(new Apple());
    }

    public static class Person {
        public Apple eat(Apple apple){
            return apple.getPeeled();
        }
    }

    public static class Peelor {
        public Apple peeled(Apple apple){
            return apple;
        }
    }

    public static class Apple {
        public Apple getPeeled(){
            return new Peelor().peeled(this);
        }
    }
}
