package com.chris.design_pattern.factory.factory;

/**
 * Created by ye830 on 4/7/2018.
 */
public abstract class GameConsole {

    public void play(String gameType) {
        Game game = getGame(gameType);
        game.openBox();
        game.insertIntoConsole();
        game.play();
    }

    abstract Game getGame(String gameType);
}
