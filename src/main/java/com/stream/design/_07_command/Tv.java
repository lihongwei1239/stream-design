package com.stream.design._07_command;

//接受者
public class Tv {

    public void changeChannel(){
        System.out.println(" TV -> changeChannel");
    }

    public void turnOff(){
        System.out.println(" TV -> turnOff");
    }

    public void turnOn(){
        System.out.println(" TV -> turnOn");
    }
}
