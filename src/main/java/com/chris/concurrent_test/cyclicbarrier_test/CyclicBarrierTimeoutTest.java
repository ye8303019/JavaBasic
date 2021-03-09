package com.chris.concurrent_test.cyclicbarrier_test;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * Created by ye830 on 3/9/2021.
 * 例如 要等待所有成员都入关之后，进行集合，然后一起去下一个目的地 （模拟其中一个人迟到了）
 */
public class CyclicBarrierTimeoutTest {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(10,
                () -> System.out.println("----------- Everyone is here, let's go to the next station"));
        for (int i = 0; i < 10; i++) {
            if(i < 9){
                new Immigration(cyclicBarrier).start();
            } else {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                new Immigration(cyclicBarrier).start();
            }

        }
    }

    static class Immigration extends Thread {
        private CyclicBarrier cyclicBarrier;

        public Immigration(CyclicBarrier cyclicBarrier) {
            this.cyclicBarrier = cyclicBarrier;
        }

        @Override
        public void run() {
            System.out.println("----------- " + Thread.currentThread().getName() + " Start going through the immigration formalities");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("----------- " + Thread.currentThread().getName() + " Finish the immigration formalities");
            try {
                cyclicBarrier.await(2000, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                System.out.println("!!!!!!!!!!! " + Thread.currentThread().getName() + " is InterruptedException");
            } catch (BrokenBarrierException e) {
                System.out.println("!!!!!!!!!!! " + Thread.currentThread().getName() + " is BrokenBarrierException");
            } catch (TimeoutException e) {
                System.out.println("!!!!!!!!!!! " + Thread.currentThread().getName() + " is timeout");
            }
        }
    }
}
