package com.example.javafundemental.lambda;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Consumer获取消费不返回
 * Predicate返回布尔值
 * Supplier接收参数直接提供数据
 * Runnable不要也不给
 * Function又要也要给
 */
public class LambdaTypesApp {

    public <T> void consumeApp(Consumer<T> consumer, T data) {
        consumer.accept(data);
    }

    public <T>  T supplierApp(Supplier<T> supplier) {
        return supplier.get();
    }

    public <T, R> R functionApp(Function<T, R> function, T data){
        return function.apply(data);
    }

    public void runnableApp(Runnable runnable){
        runnable.run();
    }

    public <T> Boolean predicateApp(Predicate<T> predicate, T data) {
        return predicate.test(data);
    }

    @Test
    public void testAllLambdaTypes() {
        consumeApp(System.out::println,BigDecimal.TWO);

        BigDecimal bigDecimal = supplierApp(() -> BigDecimal.TWO.add(BigDecimal.ONE));
        assertThat(bigDecimal).isEqualTo(BigDecimal.valueOf(3));

        BigDecimal functionResult = functionApp((s) -> s.add(BigDecimal.ONE), BigDecimal.TWO);
        assertThat(functionResult).isEqualTo(BigDecimal.valueOf(3));

        runnableApp(()->System.out.println("runnable testing"));

        Boolean b = predicateApp(s -> s > 1, 2);
        assertThat(b).isEqualTo(Boolean.TRUE);


    }

}
