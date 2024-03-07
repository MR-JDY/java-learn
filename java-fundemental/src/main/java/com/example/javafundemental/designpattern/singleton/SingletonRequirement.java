package com.example.javafundemental.designpattern.singleton;

/**
 * 很多时候只希望一个类只存在一个实例
 * 饿汉式
 */
public class SingletonRequirement {

    private static SingletonRequirement singletonRequirement = new SingletonRequirement();
    //不允许new
    private SingletonRequirement(){}

    public static SingletonRequirement getInstance() {
        return singletonRequirement;
    }


}
