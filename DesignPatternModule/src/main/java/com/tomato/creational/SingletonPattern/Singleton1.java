package com.tomato.creational.SingletonPattern;

/**
 * 饿汉式单例
 * 单例模式的简单实现就是
 * 成员是 私有的静态的
 * 构造方法是 私有的
 * 对外暴露的获取访问是 公有的静态的
 */
public class Singleton1 {

    private static Singleton1 singleton1 = new Singleton1();

    private Singleton1() {

    }

    public static Singleton1 getInstance() {
        return singleton1;
    }

}
