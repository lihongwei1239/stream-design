package com.stream.design._08_state;

public class FreeState extends State {
    @Override
    public String getState() {
        return "当前状态为空闲状态！";
    }

    @Override
    public void book(Room room) {
        System.out.println("当前状态是空闲状态，进行预定操作");
        room.setState(new BookState());
    }

    @Override
    public void checkin(Room room) {
        System.out.println("当前状态是空闲状态，进行入住操作");
        room.setState(new CheckInState());

    }

    @Override
    public void unbook(Room room) {
        System.out.println("当前状态是空闲状态，无法进行取消预定操作");
    }

    @Override
    public void checkout(Room room) {
        System.out.println("当前状态是空闲状态，无法进行退房操作");
    }
}
