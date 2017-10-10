package com.stream.design._04_adapter;

//对象适配器
public class AdapterObject implements ITarget {

    private Adaptee adaptee;

    public void setAdaptee(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void A() throws Exception{
        System.out.println("Adaptee ->  A");
    }

    @Override
    public void B() throws Exception {
        System.out.println("Adaptee ->  B");
    }

}
