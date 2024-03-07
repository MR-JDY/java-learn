package com.example.javafundemental.designpattern.strategy;

public class StrategyRoute {
    private StrategyInterface strategyInterface;
    public StrategyRoute(StrategyInterface strategyInterface) {
        this.strategyInterface = strategyInterface;
    }

    public String executeQuery(String resoureId) {
        return strategyInterface.execute(resoureId);
    }
}
