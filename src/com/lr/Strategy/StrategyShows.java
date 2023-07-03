package com.lr.Strategy;

public class StrategyShows {
    //持有抽象策略角色的引用
    private Strategy strategy;
    public StrategyShows(Strategy strategy) {
        this.strategy = strategy;
    }
    public String StrategShow(){
        return strategy.show();
    }

}
