package com.stream.design._04_adapter;

//类适配器
public class AdapterClass extends Adaptee  implements ITarget{

    public void A() throws Exception{
        System.out.println("Adaptee ->  A");
    }

    @Override
    public void B() throws Exception {
        System.out.println("Adaptee ->  B");
    }


}
