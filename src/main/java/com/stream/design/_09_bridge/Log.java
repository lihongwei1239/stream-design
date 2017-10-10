package com.stream.design._09_bridge;

//日志维度抽象类 包含平台对象
public abstract class Log {

    protected ImpLog impLog;

    public void setImpLog(ImpLog impLog) {
        this.impLog = impLog;
    }

    public abstract void Write(String log);
}
