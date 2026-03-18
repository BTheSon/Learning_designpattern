package vn.edu.qnu.example.creational.builder.builder;

import vn.edu.qnu.example.creational.builder.room.LivingRoom;
import vn.edu.qnu.example.creational.builder.room.Room;

public class LivingRoomBuilder implements RoomBuilder {
    private int size;
    private String wallColor;
    private boolean hasFireplace;
    private String sofaColor;

    @Override
    public RoomBuilder setSize(int size) {
        this.size = size;
        return this;
    }

    @Override
    public RoomBuilder setWallColor(String wallColor) {
        this.wallColor = wallColor;
        return this;
    }

    public RoomBuilder setHasFireplace(boolean hasFireplace) {
        this.hasFireplace = hasFireplace;
        return this;
    }

    public RoomBuilder setSofaColor(String sofaColor) {
        this.sofaColor = sofaColor;
        return this;
    }

    @Override
    public Room build() {
        return new LivingRoom(size, wallColor, hasFireplace, sofaColor);
    }
}
