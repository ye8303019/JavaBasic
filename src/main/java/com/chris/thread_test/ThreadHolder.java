package com.chris.thread_test;

/**
 * Created by ye830 on 9/15/2017.
 */
public class ThreadHolder {

    public static final InheritableThreadLocal<String> tl = new InheritableThreadLocal<>();

    //public static final ThreadLocal<String> tl = new ThreadLocal<>();

    public static final String get(){
        return tl.get();
    }

    public static final void set(String value){
        tl.set(value);
    }
}
