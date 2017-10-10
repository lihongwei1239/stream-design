package com.stream.design._03_observer;


import java.util.ArrayList;
import java.util.List;

//被观察者实现类
public class Teacher implements Subject {

    private String phone;

    //观察者容器
    private List<Object> observers;

    public Teacher() {
        observers = new ArrayList<>();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
        nofityObservers();
    }

    @Override
    public void registerObserver(Object o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Object o) {
        observers.remove(o);
    }

    @Override
    public void nofityObservers() {
        for (Object o: observers
             ) {
            Observer observer = (Observer) o;
            observer.update(this.phone);
        }
    }
}
