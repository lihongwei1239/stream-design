package com.stream.design._07_command;

//命令调用者
public class Contorl {

    private Commmad commmadOn,commmadOff,commmadChange;

    public Contorl(Commmad commmadOn, Commmad commmadOff, Commmad commmadChange) {
        this.commmadOn = commmadOn;
        this.commmadOff = commmadOff;
        this.commmadChange = commmadChange;
    }

    public void changeChannel(){
        commmadChange.execute();
    }

    public void turnOff(){
        commmadOff.execute();
    }

    public void turnOn(){
        commmadOn.execute();
    }
}
