package com.stream.design._01_strategy;


//策略实现类
public class ConcreteStrategy implements IStrategy {

    @Override
    public void doThing() {
        System.out.println("策略实现类");
    }
}
