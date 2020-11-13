package com.chris.gc_test;

/**
 * Created by ye830 on 8/25/2017.
 */
public class GcTest {

    public static void main(String[] args) throws InterruptedException {

        Thread.sleep(5000);

        for (int i = 0; i < 500; i++) {
            new MemoryObject(2);

            Thread.sleep(100);
        }

    }

    static class MemoryObject {

        Byte[] memoryObj;

        public MemoryObject(int count) {
            memoryObj = new Byte[count * 1024 * 1024];
        }
    }

}
