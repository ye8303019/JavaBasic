package com.chris.thread_test;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by ye830 on 9/15/2017.
 */
public class ThreadPoolTest {

    private static final AtomicInteger index = new AtomicInteger(1);

    public static final ThreadPoolExecutor executor = new ThreadPoolExecutor(10, 10,
            60000L, TimeUnit.MILLISECONDS,
            new LinkedBlockingQueue<>(1),
            new MyThreadFactory());

    static {
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
    }

    static class MyThreadFactory implements ThreadFactory {
        @Override
        public Thread newThread(Runnable r) {
            Thread t = new Thread(r, "MyThread-" + index.getAndIncrement());
            t.setDaemon(false);
            if (t.getPriority() != Thread.NORM_PRIORITY) {
                t.setPriority(Thread.NORM_PRIORITY);
            }
            return t;
        }
    }
}
