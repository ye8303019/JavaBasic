package com.chris.concurrent_test.future_test;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by ye830 on 5/19/2018.
 */
public class Bootstrap {

    static final ExecutorService threadPool = new ThreadPoolExecutor(10,10,
            60, TimeUnit.SECONDS,
            new LinkedBlockingQueue<>(1000),
            new MyThreadFactory("MyTestThread"),
            new MyAbortPolicy());

    public static void main(String[] args) throws InterruptedException {
        BlockingQueue linkedBlockingQueue = new LinkedBlockingQueue<>(1000);
        linkedBlockingQueue.add("String1");
        linkedBlockingQueue.add("String2");
        linkedBlockingQueue.add("String3");

        String myValue = (String)linkedBlockingQueue.take();
        System.out.println(myValue);

        Future<?> future = threadPool.submit(() -> {System.out.println("This is test");});

        BlockingQueue synchronousQueue = new SynchronousQueue<>();
        synchronousQueue.add("String1");
        synchronousQueue.add("String2");
        synchronousQueue.add("String3");

        myValue = (String)synchronousQueue.take();
        System.out.println(myValue);
    }

    public static class MyThreadFactory implements ThreadFactory {

        private ThreadGroup threadGroup;

        private String namePrefix;

        private AtomicInteger threadNumber = new AtomicInteger(0);

        public MyThreadFactory (String prefix){
            SecurityManager securityManager = new SecurityManager();
            threadGroup = securityManager.getThreadGroup();
            namePrefix = prefix + "-ThreadPool-";
        }

        @Override
        public Thread newThread (Runnable r){
            return new Thread(threadGroup, r, namePrefix + threadNumber.getAndIncrement());
        }
    }

    public static class MyAbortPolicy implements RejectedExecutionHandler {
        /**
         * Creates an {@code AbortPolicy}.
         */
        public MyAbortPolicy() { }

        @Override
        public void rejectedExecution(Runnable r, ThreadPoolExecutor e) {
            throw new RejectedExecutionException("Task " + r.toString() +
                    " rejected from " +
                    e.toString());
        }
    }
}
