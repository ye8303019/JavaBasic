package com.chris.concurrent_test.countdownlatch_test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * Created by ye830 on 3/9/2021.
 * 假设要等待读取完 10 个文件后，再回到主线程继续之后的操作 （模拟其中一次读取超时）
 */
public class CountDownLatchTimeoutTest {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(10);
        for (int i = 0; i < 10; i++) {
            if (i < 9) {
                new Writer(countDownLatch).start();
            } else {
                new TimeoutWriter(countDownLatch).start();
            }
        }
        try {
            countDownLatch.await(2000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (countDownLatch.getCount() != 0L) {
            System.out.println("Remain count: " + countDownLatch.getCount() + ", warning, some tasks are broken, let's stop the following tasks");
        } else {
            System.out.println("All tasks have finished, keep doing the rest of the works");
        }

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

    public static class TimeoutWriter extends Thread {
        private CountDownLatch countDownLatch;

        public TimeoutWriter(CountDownLatch countDownLatch) {
            this.countDownLatch = countDownLatch;
        }

        @Override
        public void run() {
            System.out.println("------ " + Thread.currentThread().getName() + " start writing the file");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("------ " + Thread.currentThread().getName() + " finish writing the file");
            countDownLatch.countDown();
        }
    }
}
