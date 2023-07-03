package com.lr.Strategy;

public class StrategyPattren {
    public static void main(String[] args) {
        StrategyShows strategyShowsA = new StrategyShows(new StrategyA());
        StrategyShows strategyShowsB = new StrategyShows(new StrategyB());
        StrategyShows strategyShowsC = new StrategyShows(new StrategyC());

        System.out.println(strategyShowsA.StrategShow());
        System.out.println(strategyShowsB.StrategShow());
        System.out.println(strategyShowsC.StrategShow());

   }
}



