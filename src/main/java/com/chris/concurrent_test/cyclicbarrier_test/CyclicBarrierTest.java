package com.chris.concurrent_test.cyclicbarrier_test;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Created by ye830 on 3/9/2021.
 * 例如 要等待所有成员都入关之后，进行集合，然后一起去下一个目的地
 */
public class CyclicBarrierTest {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(10,
                () -> System.out.println("----------- Everyone is here, let's go to the next station"));
        for(int i =0;i<10;i++){
            new Immigration(cyclicBarrier).start();
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
                cyclicBarrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }
}
