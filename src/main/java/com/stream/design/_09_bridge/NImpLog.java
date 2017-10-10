package com.stream.design._09_bridge;


public class NImpLog extends ImpLog {
    @Override
    public void execute(String msg) {
        System.out.println(".NET ->" + msg);
    }
}
