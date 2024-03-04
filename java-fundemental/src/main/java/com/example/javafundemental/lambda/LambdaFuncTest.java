package com.example.javafundemental.lambda;

import java.math.BigDecimal;

public class LambdaFuncTest {

    /**
     * 测试Doc文档生成
     * {@link LambdaFunctionInterface#operate(Object, Object)}
     * @param args
     */
    public static void main(String[] args) {
        LambdaFunctionInterface<Integer, Integer> functionInterface= Integer::sum;
        int operate = functionInterface.operate(2, 3);
        System.out.println(operate);

        LambdaFunctionInterface<BigDecimal, BigDecimal> functionInterface2= BigDecimal::add;
        BigDecimal operate2 = functionInterface2.operate(BigDecimal.valueOf(2.00), BigDecimal.valueOf(3.001));
        System.out.println(operate2);
    }
}
