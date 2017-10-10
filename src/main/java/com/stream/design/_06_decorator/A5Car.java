package com.stream.design._06_decorator;

//装饰类
public class A5Car extends Car {

    public A5Car() {
        this.cost = 500;
        this.description ="A5 Car";
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
