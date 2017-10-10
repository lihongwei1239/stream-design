package com.stream.design._03_observer;

//观察者
public class Student implements Observer {

    private String name;

    private String t_phone;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getT_phone() {
        return t_phone;
    }

    public void setT_phone(String t_phone) {
        this.t_phone = t_phone;
    }

    @Override
    public void update(Object o) {
        this.t_phone = (String) o;
    }

    public void show(){
        System.out.println("name:"+name+",phone:"+t_phone);
    }

}
