package com.stream.design._09_bridge;

public class DataBaseLog extends Log {
    @Override
    public void Write(String log) {
        this.impLog.execute(log);
    }
}
