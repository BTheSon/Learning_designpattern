package vn.edu.qnu.example.creational.builder.room.impl;

import vn.edu.qnu.example.creational.builder.room.Bedroom;

public class SimpleBedroom extends Bedroom {
    public SimpleBedroom(int size, String wallColor) {
        super(size, wallColor, "Single", 1);
    }
}
