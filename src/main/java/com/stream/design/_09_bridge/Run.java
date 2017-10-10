package com.stream.design._09_bridge;

public class Run {

    public static void main(String[] args){

        Log dblog=new DataBaseLog();
        dblog.setImpLog(new NImpLog());
        dblog.Write("db log");

        Log textLog=new TextFileLog();
        textLog.setImpLog(new JImpLog());
        textLog.Write("text log");

    }

}
