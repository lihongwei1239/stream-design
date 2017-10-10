package com.stream.design._03_observer;

//被观察者接口
public interface Subject {

    public void registerObserver(Object o);

    public void removeObserver(Object o);

    public void nofityObservers();

    public void setPhone(String phone);

}
