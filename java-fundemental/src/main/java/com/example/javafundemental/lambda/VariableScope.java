package com.example.javafundemental.lambda;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class VariableScope {

    public static int i = 0;//类成员变量
    public int j = 0;//实例变量

    @Test
    public void test() {
        test1();
        test2();
        VariableScope variableScope = new VariableScope();
        assertThat(variableScope.j).isEqualTo(0);
        assertThat(VariableScope.i).isEqualTo(2);
    }
    @Test
    public void test1() {
        VariableScope variableScope = new VariableScope();
        variableScope.j ++;
        VariableScope.i++;
    }

    @Test
    public void test2() {
        VariableScope variableScope = new VariableScope();
        variableScope.j ++;
        VariableScope.i++;
    }
}
