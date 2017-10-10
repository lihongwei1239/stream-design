package com.stream.design._07_command;

public class Run {

    public static void main(String[] args){

        Tv tv = new Tv();

        Commmad commmadOn = new CommadOn(tv);
        Commmad commadOff = new CommadOff(tv);
        Commmad commadChange = new CommadChange(tv);

        Contorl contorl = new Contorl(commmadOn,commadOff,commadChange);

        contorl.turnOn();;
        contorl.turnOff();
        contorl.changeChannel();

    }
}
