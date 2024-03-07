package com.example.javafundemental.designpattern.strategy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 为了解决太多if else带来的复杂性
 *      if(){
 *         doSomething();
 *     }else if(){
 *         doAnotherThing();
 *     }else if(){
 *         doAnotherThing();
 *     }
 */
@SpringBootTest
public class StrategyRequirement {

    @Autowired
    private ApplicationContext applicationContext;

    StrategyInterface getStrategyInterface(String name) {
        return applicationContext.getBean(name, StrategyInterface.class);
    }
    @Test
    public void testStrategy() {
        StrategyRoute strategyRouteA = new StrategyRoute(new StrategyImpA());
        String aStr = strategyRouteA.executeQuery(" 结束符！");
        assertThat(aStr).isEqualTo("Executing StrategyImpA 结束符！");

        StrategyRoute strategyRouteB = new StrategyRoute(new StrategyImpB());
        String bStr = strategyRouteB.executeQuery(" 结束符！");
        assertThat(bStr).isEqualTo("Executing StrategyImpB 结束符！");

    }

    @Test
    public void testStrategyWithSpring() {
        StrategyInterface strategyImpA = getStrategyInterface("strategyImpA");
        String execute = strategyImpA.execute(" With Spring.");
        assertThat(execute).isEqualTo("Executing StrategyImpA With Spring.");

        StrategyInterface strategyImpB = getStrategyInterface("strategyImpB");
        String execute2 = strategyImpB.execute(" With Spring.");
        assertThat(execute2).isEqualTo("Executing StrategyImpA With Spring.");
    }
}
