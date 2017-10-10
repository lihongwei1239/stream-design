package com.stream.design._08_state;

//状态抽象类
public abstract class State {

    public  abstract String getState();

    public  abstract void book(Room room);

    public  abstract void checkin(Room room);

    public  abstract void unbook(Room room);

    public  abstract void checkout(Room room);

}
