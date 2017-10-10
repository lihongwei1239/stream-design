package com.stream.design._06_decorator;

//装饰类
public class A1Car extends Car {

    public A1Car() {
        this.cost = 100;
        this.description ="A1 Car";
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return this.description;
    }
}
