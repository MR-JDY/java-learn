package com.example.javafundemental.lambda;

@FunctionalInterface
public interface LambdaFunctionInterface<A, B> {
    A operate(B x, B y);
}
