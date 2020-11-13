package com.chris.design_pattern.factory.factory;

/**
 * Created by ye830 on 4/7/2018.
 */
public abstract class Game {

    abstract String getName();

    void openBox(){
        System.out.println("Open "+getName());
    }

    void insertIntoConsole(){
        System.out.println("Insert "+getName()+" into console");
    }

    void play(){
        System.out.println("Playing "+getName());
    }
}
