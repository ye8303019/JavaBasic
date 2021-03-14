package com.chris.design_pattern.producer_consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by ye830 on 3/9/2021.
 * 例如 有1个服务员正在生产盒饭，每1秒钟生产1个盒饭， 制作完则通知其中一个消费者，同时有 5 个消费者在不断消费盒饭，每1秒消费1个这个过程持续20秒
 */
public class ProducerConsumerTest {
    public static void main(String[] args) {
        Queue<Integer> foods = new LinkedBlockingQueue<>();
        Random random = new Random();

        List<Thread> threadList = new ArrayList<>();

        Thread producer = new Producer(foods, random);
        threadList.add(producer);
        producer.start();

        for (int i = 0; i < 5; i++) {
            Consumer consumer = new Consumer(foods);
            threadList.add(consumer);
            consumer.start();
        }

        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (Thread thread : threadList) {
            thread.interrupt();
        }
    }

    private static class Producer extends Thread {
        private Queue<Integer> foods;
        private Random random;

        public Producer(Queue<Integer> foods, Random random) {
            this.foods = foods;
            this.random = random;
        }

        @Override
        public void run() {
            System.out.println("Producer " + Thread.currentThread().getName() + " is producing the box meal");
            while (true) {
                synchronized (foods) {
                    int food = random.nextInt(1000);
                    foods.add(food);
                    System.out.println("+++++++++++++ Producer " + Thread.currentThread().getName() + " has produced a meal box No." + food);
                    foods.notify();
                    System.out.println("!!!!!!!!!!!!! Producer " + Thread.currentThread().getName() + " notify a consumer");
                }

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Producer " + Thread.currentThread().getName() + " stop producing the box meal");
                    return;
                }
            }
        }
    }

    private static class Consumer extends Thread {
        private Queue<Integer> foods;

        public Consumer(Queue<Integer> foods) {
            this.foods = foods;
        }

        @Override
        public void run() {
            System.out.println("Consumer " + Thread.currentThread().getName() + " is buying the box meal");

            try {
                while (true) {
                    synchronized (foods) {
                        while (foods.isEmpty()) {
                            foods.wait();
                            System.out.println("Consumer " + Thread.currentThread().getName() + " been notified that a new box meal is ready");
                        }
                        int food = foods.remove();
                        System.out.println("------------ Consumer " + Thread.currentThread().getName() + " has bought a meal box No." + food);
                        Thread.sleep(1000);
                    }
                }
            } catch (InterruptedException e) {
                System.out.println("Consumer " + Thread.currentThread().getName() + " stop buying the box meal");
                return;
            }
        }
    }
}