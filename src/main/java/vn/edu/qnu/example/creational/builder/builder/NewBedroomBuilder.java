package vn.edu.qnu.example.creational.builder.builder;

import vn.edu.qnu.example.creational.builder.room.Bedroom;
import vn.edu.qnu.example.creational.builder.room.Room;

public class NewBedroomBuilder implements RoomBuilder {
    private int size;
    private String wallColor;
    private String bedType;
    private int numberOfBeds;

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

    public RoomBuilder setBedType(String bedType) {
        this.bedType = bedType;
        return this;
    }

    public RoomBuilder setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
        return this;
    }

    @Override
    public Room build() {
        return new Bedroom(size, wallColor, bedType, numberOfBeds);
    }
}
