package com.chris.concurrent_test.countdownlatch_test;

import java.util.concurrent.CountDownLatch;

/**
 * Created by ye830 on 3/9/2021.
 * 假设要等待读取完 10 个文件后，再回到主线程继续之后的操作
 */
public class CountDownLatchTest {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(10);
        for (int i = 0; i < 10; i++) {
            new Writer(countDownLatch).start();
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("All tasks have finished, keep doing the rest of the works");
    }

    public static class Writer extends Thread {
        private CountDownLatch countDownLatch;

        public Writer(CountDownLatch countDownLatch) {
            this.countDownLatch = countDownLatch;
        }

        @Override
        public void run() {
            System.out.println("------ " + Thread.currentThread().getName() + " start writing the file");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("------ " + Thread.currentThread().getName() + " finish writing the file");
            countDownLatch.countDown();
        }
    }
}
