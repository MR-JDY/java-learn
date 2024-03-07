package com.example.javafundemental.designpattern.strategy;

import org.springframework.stereotype.Service;

@Service
public class StrategyImpA implements StrategyInterface{
    @Override
    public String execute(String param) {
        return "Executing StrategyImpA" + param;

    }
}
