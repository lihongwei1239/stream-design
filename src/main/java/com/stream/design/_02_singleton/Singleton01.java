package com.stream.design._02_singleton;

/**
 * 单例模式
 */
public class Singleton01 {

    //实例变量静态话
    private static Singleton01 instance = null;

    //构造函数私有化
    private Singleton01() {
    }

    //访问点
    public static Singleton01 getInstance(){
        if(null == instance){
            instance = new Singleton01();
        }
        return instance;
    }
}
