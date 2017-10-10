package com.stream.design._08_state;

public class Run {

    public  static void main(String[] args){

        Room r  = new Room();
        State s = new FreeState();
        r.setState(s);

        System.out.println("==============================");
        System.out.println(r.getState());


        System.out.println("==============================");
        r.checkin();
        System.out.println(r.getState());
        System.out.println("==============================");

        System.out.println("==============================");
        r.checkout();
        System.out.println(r.getState());

        System.out.println("==============================");
        r.checkout();
        System.out.println(r.getState());
        System.out.println("==============================");



    }
}
