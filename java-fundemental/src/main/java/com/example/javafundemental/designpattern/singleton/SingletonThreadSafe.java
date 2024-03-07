package com.example.javafundemental.designpattern.singleton;

/**
 * 很多时候只希望一个类只存在一个实例
 * 线程安全
 */
public class SingletonThreadSafe {

    //volatile保证顺序性
    private static volatile SingletonThreadSafe singletonThreadSafe = null;
    //不允许new
    private SingletonThreadSafe(){}

    public static SingletonThreadSafe getInstance() {
        if (singletonThreadSafe == null) {
            synchronized (SingletonThreadSafe.class) {
                if(singletonThreadSafe == null) {
                    singletonThreadSafe = new SingletonThreadSafe();
                }
            }
        }
        return singletonThreadSafe;
    }


}
