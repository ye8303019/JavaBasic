package com.chris.design_pattern.factory.simple_factory;

/**
 * Created by ye830 on 4/7/2018.
 */
public class PS4 {
    public void play(String gameType){
        Game game = new GameFactory().choose(gameType);
        game.openBox();
        game.insertIntoConsole();
        game.play();
    }
}
