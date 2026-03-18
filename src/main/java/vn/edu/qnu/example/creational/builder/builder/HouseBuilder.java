package vn.edu.qnu.example.creational.builder.builder;

import vn.edu.qnu.example.creational.builder.House;
import vn.edu.qnu.example.creational.builder.room.Room;

import java.util.ArrayList;
import java.util.List;

public class HouseBuilder {
    private List<Room> rooms = new ArrayList<>();
    private int numberOfFloors;

    public HouseBuilder addRoom(Room room) {
        rooms.add(room);
        return this;
    }

    public HouseBuilder addRoomBuilder(RoomBuilder roomBuilder) {
        this.rooms.add(roomBuilder.build());
        return this;
    }

    public HouseBuilder setFloors(int floors) {
        this.numberOfFloors = floors;
        return this;
    }

    public House build() {
        House house = new House();
        for (Room room : rooms) {
            house.addRoom(room);
        }
        return house;
    }
}
