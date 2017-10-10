package com.stream.design._06_decorator;

public class Run {

    public static void main(String[] args){

        A1Car a1 = new A1Car();
        A5Car a5 = new A5Car();

        Decorator gps = new Gps();
        gps.setCar(a5);

        gps.getCost();
        gps.getDescription();

    }
}
