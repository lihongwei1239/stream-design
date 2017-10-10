package com.stream.design._08_state;

//环境类
public class Room {
    
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public String getState() {
        return state.getState();
    }

    public void book(){
        state.book(this);
    }
    public void checkin(){
        state.checkin(this);
    }
    public void unbook(){
        state.unbook(this);
    }
    public void checkout(){
        state.checkout(this);
    }
}
