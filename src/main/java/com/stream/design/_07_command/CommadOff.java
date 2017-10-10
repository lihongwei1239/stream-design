package com.stream.design._07_command;

//命令实现者
public class CommadOff implements Commmad {

    //接受者
    private Tv tv;

    public CommadOff(Tv tv) {
        this.tv = tv;
    }

    public void setTv(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOff();
    }
}
