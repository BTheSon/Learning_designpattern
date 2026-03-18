package vn.edu.qnu.example.creational.builder.room;

public abstract class Room {
    private int size;
    private String wallColor;

    public Room(int size, String wallColor) {
        this.size = size;
        this.wallColor = wallColor;
    }

    @Override
    public String toString() {
        return "size=" + size + ", wallColor='" + wallColor + "'";
    }
}
