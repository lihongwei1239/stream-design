package com.stream.design._05_composite;

public class Run {

    public static void main(String[] args){

        Doc doc1 = new Doc("子节点1");
        Doc doc2 = new Doc("子节点2");
        Doc doc3 = new Doc("子节点3");

        Files files = new Files("文件夹1");

        files.add(doc1);
        files.add(doc2);
        files.add(doc3);

        files.diaplay(1);

    }
}
