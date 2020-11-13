package com.chris.design_pattern.factory.simple_factory;

/**
 * Created by ye830 on 4/7/2018.
 */
public class GameFactory {
    public Game choose(String gameType){
        if("GTA5" == gameType){
            return new GTA5();
        } else if("Biohazard7" == gameType){
            return new Biohazard7();
        } else {
            return new Biohazard7();
        }
    }
}
