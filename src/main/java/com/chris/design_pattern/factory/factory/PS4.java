package com.chris.design_pattern.factory.factory;


/**
 * Created by ye830 on 4/7/2018.
 */
public class PS4 extends GameConsole {
    @Override
    public Game getGame(String gameType){
        if("GTA5" == gameType){
            return new GTA5();
        } else if("Biohazard7" == gameType){
            return new Biohazard7();
        } else {
            return new Biohazard7();
        }
    }
}
