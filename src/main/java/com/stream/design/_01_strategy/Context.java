package com.stream.design._01_strategy;

//环境类
public class Context {

    private IStrategy _strategy;

    public IStrategy get_strategy() {
        return _strategy;
    }

    public void set_strategy(IStrategy _strategy) {
        this._strategy = _strategy;
    }

    public void doThding(){
        _strategy.doThing();
    }
}
