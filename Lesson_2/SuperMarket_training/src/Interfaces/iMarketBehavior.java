package Interfaces;

import java.util.List;

import Classes.Actor;

public interface iMarketBehavior {

    public void acceptToMarket(Actor actor);
    public void releaseFromMarket(List<Actor> actor);
    
}
