package com.example.javafundemental.lambda;




/**
 * 父类静态变量
 * 父类静态代码块
 * 子类静态变量
 * 子类静态块
 * main 第一方法
 * 父类普通静态方法
 * main 第二方法
 * 子类普通静态方法
 * main 第三方法
 * 父类非静态变量
 * 父类非静态代码块
 * 父类构造方法
 * 子类非静态变量
 * 子类非静态代码块
 * 子类构造器
 *
 *
 * 1.总结是静态变量跟静态代码块一定是先执行且执行一次
 * 2.大范围父子顺序，小范围非静态变量>非静态代码块>构造器
 */
class InitSequenceParent {

    public InitSequenceParent() {
        System.out.println("父类构造方法");
    }

    String b = "父类非静态变量";
    {
        System.out.println(b);
        System.out.println("父类非静态代码块");
    }

    static String a = "父类静态变量";

    static {
        System.out.println(a);
        System.out.println("父类静态代码块");
    }

    public static void A() {
        System.out.println("父类普通静态方法");
    }

}

class Derived extends InitSequenceParent {

    public Derived() {
        System.out.println("子类构造器");
    }

    String b = "子类非静态变量";
    {
        System.out.println(b);
        System.out.println("子类非静态代码块");
    }

    static String a = "子类静态变量";

    static {
        System.out.println(a);
        System.out.println("子类静态块");
    }

    public static void A() {
        System.out.println("子类普通静态方法");
    }

    public static void main(String[] args) {
        System.out.println("main 第一方法");
        InitSequenceParent.A();
        System.out.println("main 第二方法");
        Derived.A();
        System.out.println("main 第三方法");
        new Derived();
    }
}
