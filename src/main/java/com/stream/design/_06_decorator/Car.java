package com.stream.design._06_decorator;

//装饰类接口
public abstract class Car {

    protected int cost;
    protected String description;

    public abstract int getCost();

    public abstract String getDescription();

}
