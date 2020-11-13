package com.chris.lock_test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by ye830 on 11/13/2020.
 */
public class ReadWriteCache {
    //充当cache
    static Map<String, Object> map = new HashMap<>();
    //实例化读写锁对象
    static ReentrantReadWriteLock reentrantReadWriteLock =
            new ReentrantReadWriteLock();
    //实例化读锁
    static Lock r = reentrantReadWriteLock.readLock();
    //实例化写锁
    static Lock w = reentrantReadWriteLock.writeLock();

    //获取缓存中值
    public static final Object get(String key) {
        r.lock();
        System.out.println("Ready To Read:" + key);
        try {
            Thread.sleep(1000);
            Object value = map.get(key);
            System.out.println("Read Done:" + key + " Value:" + value);
            return value;
        } catch (InterruptedException e) {
            return new Exception();
        } finally {
            r.unlock();
        }
    }

    //写缓存中值，并返回对应value
    public static final Object set(String key, Object obj) {
        w.lock();
        System.out.println("Ready To Write Key:" + "key, Value:" + obj.toString());
        try {
            return map.put(key, obj);
        } finally {
            System.out.println("Write Done:" + "key, Value:" + obj.toString());
            w.unlock();
        }
    }

    //清空所有内容
    public static final void clear() {
        w.lock();
        try {
            map.clear();
        } finally {
            w.unlock();
        }
    }

    public static void main(String[] args) {
//        //启动5个读线程，每个线程睡1秒后再读取
//        for (int i = 0; i < 5; i++) {
//            new Thread() {
//                @Override
//                public void run() {
//                    ReadWriteCache.get("test_key");
//                }
//            }.start();
//        }

        //启动2个写线程，写入
        for (int i = 0; i < 2; i++) {
            new Thread() {
                @Override
                public void run() {
                    ReadWriteCache.set("test_key", "test_value");
                }
            }.start();
        }

        new Thread() {
            @Override
            public void run() {
                ReadWriteCache.get("test_key");
            }
        }.start();
    }
}
