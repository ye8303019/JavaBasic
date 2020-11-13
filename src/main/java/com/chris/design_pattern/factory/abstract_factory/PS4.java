package com.chris.design_pattern.factory.abstract_factory;


/**
 * Created by ye830 on 4/7/2018.
 */
public class PS4 {
    private GameFactory gameFactory;
    public PS4(GameFactory gameFactory){
        this.gameFactory = gameFactory;
    }

    public void play(String gameType){
        Game game = gameFactory.getGame(gameType);
        game.openBox();
        game.insertIntoConsole();
        game.play();
    }
}
