package vn.edu.qnu.example.creational.builder.builder;

import vn.edu.qnu.example.creational.builder.room.Room;

public interface RoomBuilder {
    RoomBuilder setSize(int size);
    RoomBuilder setWallColor(String wallColor);
    Room build();
}
