package com.stream.design._08_state;

public class CheckInState extends State {
    @Override
    public String getState() {
        return "当前状态为入住状态！";
    }

    @Override
    public void book(Room room) {
        System.out.println("当前状态是入住状态，无法进行预定操作");
    }

    @Override
    public void checkin(Room room) {
        System.out.println("当前状态是入住状态，无法进行入住操作");
    }

    @Override
    public void unbook(Room room) {
        System.out.println("当前状态是入住状态，无法进行取消预定操作");
    }

    @Override
    public void checkout(Room room) {
        System.out.println("当前状态是入住状态，进行退房操作");
        room.setState(new FreeState());
    }
}
