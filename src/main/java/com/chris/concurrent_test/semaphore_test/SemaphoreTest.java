package com.chris.concurrent_test.semaphore_test;

import java.util.concurrent.Semaphore;

/**
 * Created by ye830 on 3/9/2021.
 * 例如 有5张桌子，有10个家庭要排队吃饭
 */
public class SemaphoreTest {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(5, true);
        for (int i = 0; i < 10; i++) {
            new Repast(semaphore).start();
        }
    }

    static class Repast extends Thread {
        private Semaphore semaphore;

        public Repast(Semaphore semaphore) {
            this.semaphore = semaphore;
        }

        @Override
        public void run() {
            try {
                semaphore.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("+++++++++++ " + Thread.currentThread().getName() + " start repast");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("----------- " + Thread.currentThread().getName() + " finish repast");
            semaphore.release();
        }
    }
}
