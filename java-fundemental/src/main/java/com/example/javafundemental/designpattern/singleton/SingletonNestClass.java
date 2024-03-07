package com.example.javafundemental.designpattern.singleton;

/**
 * 很多时候只希望一个类只存在一个实例
 * 嵌套类
 */
public class SingletonNestClass {

    private SingletonNestClass(){}

    //嵌套类用到时候才会初始化，那里面的成员变量也是等同于懒加载
    private static class NestClass{
        private static final SingletonNestClass INSTANCE = new SingletonNestClass();
    }
    public static SingletonNestClass getInstance() {
        return NestClass.INSTANCE;
    }


}
