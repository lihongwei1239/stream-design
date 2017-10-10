package com.stream.design._04_adapter;

public class Run {

    public static void main(String [] args) throws Exception{


        //类适配器
        ITarget targetClass = new AdapterClass();
        targetClass.A();;
        targetClass.B();;


        //对象适配器
        Adaptee adaptee = new Adaptee();
        AdapterObject targetOject = new AdapterObject();
        targetOject.setAdaptee(adaptee);
        targetOject.A();;
        targetOject.B();;


    }
}
