package com.stream.design._01_strategy;

public class Run {

    public  static void main(String[] args){
        Context context = new Context();
        IStrategy strategy = new ConcreteStrategy();
        context.set_strategy(strategy);
        context.doThding();
    }

}
