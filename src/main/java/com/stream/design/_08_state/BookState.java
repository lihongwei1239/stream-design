package com.stream.design._08_state;

public class BookState extends State{

    @Override
    public String getState() {
        return "当前状态为预定状态！";
    }

    @Override
    public void book(Room room) {
        System.out.println("当前状态是预定状态，无法进行预定操作");
    }

    @Override
    public void checkin(Room room) {
        System.out.println("当前状态是预定状态，进行入住操作");
        room.setState(new CheckInState());
    }

    @Override
    public void unbook(Room room) {
        System.out.println("当前状态是预定状态，进行取消预定操作");
        room.setState(new FreeState());
    }

    @Override
    public void checkout(Room room) {
        System.out.println("当前状态是预定状态，无法进行退房操作");
    }
}
