package com.stream.design._05_composite;

//抽象组件类
public abstract class Component {

    protected String name;

    public  abstract void add(Component c);

    public  abstract void remove(Component c);

    public abstract  void diaplay(int depath);

}
