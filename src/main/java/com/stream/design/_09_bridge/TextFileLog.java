package com.stream.design._09_bridge;

public class TextFileLog extends Log {
    @Override
    public void Write(String log) {
        this.impLog.execute(log);
    }
}
