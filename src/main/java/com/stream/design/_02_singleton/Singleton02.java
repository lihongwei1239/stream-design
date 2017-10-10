package com.stream.design._02_singleton;

/**
 * 单例模式
 */
public class Singleton02 {

    //实例变量静态化并且实现
    private static Singleton02 instance = new Singleton02();

    //构造函数私有化
    private Singleton02() {
    }

    //访问点
    public static Singleton02 getInstance(){
        return  instance;
    }
}
