package com.chris.static_test.load_sequence_test;

/**
 * Created by ye830 on 4/21/2018.
 */
public class LoadSequenceBase {
    static {
        System.out.println("I am in LoadSequenceBase static code block");
    }

    public LoadSequenceBase(){
        System.out.println("I am in LoadSequenceBase constructor");
    }
}
