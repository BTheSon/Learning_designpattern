package vn.edu.qnu.example.creational.builder.room.impl;

import vn.edu.qnu.example.creational.builder.room.LivingRoom;

public class LuxuryLivingRoom extends LivingRoom {
    public LuxuryLivingRoom(int size, String wallColor) {
        super(size, wallColor, true, "Leather");
    }
}
