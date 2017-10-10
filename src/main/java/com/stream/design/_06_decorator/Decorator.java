package com.stream.design._06_decorator;


public class Decorator extends Car {
    protected Car car;

    protected int decoratorCost;
    protected String decoratorDescription;

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public int getCost() {
        return car.getCost()+decoratorCost;
    }

    @Override
    public String getDescription() {
        return car.getDescription()+decoratorDescription;
    }
}
