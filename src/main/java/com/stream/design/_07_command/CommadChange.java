package com.stream.design._07_command;

//命令实现者
public class CommadChange implements Commmad {

    //接受者
    private Tv tv;

    public CommadChange(Tv tv) {
        this.tv = tv;
    }

    public void setTv(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.changeChannel();
    }
}
