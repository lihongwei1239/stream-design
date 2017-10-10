package com.stream.design._09_bridge;


public class JImpLog extends ImpLog {
    @Override
    public void execute(String msg) {
        System.out.println(".java ->" + msg);
    }
}
