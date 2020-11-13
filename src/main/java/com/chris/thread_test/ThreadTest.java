package com.chris.thread_test;

/**
 * Created by ye830 on 11/2/2017.
 */
public class ThreadTest implements Runnable {
    int b = 100;

    synchronized void m1() throws InterruptedException {
        Thread.sleep(500); //6
        b = 1000;

        System.out.println("b=" + b);
    }

    synchronized void m2() throws InterruptedException {
        Thread.sleep(250); //5
        int b = 2000;
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadTest tt = new ThreadTest();
        Thread t = new Thread(tt);  //1
        t.start(); //2

        tt.m2(); //3

        System.out.println("main thread b=" + tt.b); //4
    }

    @Override
    public void run() {
        try {
            m1();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
