package com.stream.design._03_observer;

public class Run {

    public static void main(String[] args){

        //被观察者实例化
        Subject teacher = new Teacher();

        //观察者实例化
        Observer zhangsan = new Student("zhangsan");
        Observer lisi = new Student("lisi =");
        Observer wangwu = new Student("wangwu = new");

        //将观察者注册到被观察者容器中国
        teacher.registerObserver(zhangsan);
        teacher.registerObserver(wangwu);
        teacher.registerObserver(lisi);

        teacher.setPhone("10086");
        zhangsan.show();
        lisi.show();
        wangwu.show();

        teacher.removeObserver(wangwu);
        teacher.setPhone("1004");
        zhangsan.show();
        lisi.show();
        wangwu.show();


    }
}
