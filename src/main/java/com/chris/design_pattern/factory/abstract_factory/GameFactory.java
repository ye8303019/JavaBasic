package com.chris.design_pattern.factory.abstract_factory;

/**
 * Created by ye830 on 4/7/2018.
 */
public interface GameFactory {
    Game getGame(String gameType);
}
