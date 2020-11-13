package com.chris.thread_test;

/**
 * Created by ye830 on 9/15/2017.
 */
public class ThreadLocalTest {
    public static void main(String... arg) throws InterruptedException {

        System.out.println("Current Thread Name is :" + Thread.currentThread().getName() + " and thread local value is:" + ThreadHolder.get());

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                ThreadHolder.set("I am T1");

                ThreadPoolTest.executor.submit(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("Current Thread Name is :" + Thread.currentThread().getName() + " and thread local value is:" + ThreadHolder.get());
                    }
                });
            }
        });

        t1.start();

        sleep();


        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                ThreadHolder.set("I am T2");

                ThreadPoolTest.executor.submit(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("Current Thread Name is :" + Thread.currentThread().getName() + " and thread local value is:" + ThreadHolder.get());
                    }
                });
            }
        });

        t2.start();

        sleep();

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                ThreadHolder.set("I am T3");

                ThreadPoolTest.executor.submit(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("Current Thread Name is :" + Thread.currentThread().getName() + " and thread local value is:" + ThreadHolder.get());
                    }
                });
            }
        });

        t3.start();

        sleep();

        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                ThreadHolder.set("I am T4");

                ThreadPoolTest.executor.submit(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("Current Thread Name is :" + Thread.currentThread().getName() + " and thread local value is:" + ThreadHolder.get());
                    }
                });
            }
        });

        t4.start();

        sleep();
    }

    public static void sleep() throws InterruptedException {
        //Thread.sleep(1000L);
    }
}
