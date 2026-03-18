package vn.edu.qnu.example.creational.builder.room;

public class Bedroom extends Room {
    private String bedType;
    private int numberOfBeds;

    public Bedroom(int size, String wallColor, String bedType, int numberOfBeds) {
        super(size, wallColor);
        this.bedType = bedType;
        this.numberOfBeds = numberOfBeds;
    }

    @Override
    public String toString() {
        return "Bedroom{" + super.toString() + ", bedType='" + bedType + "', numberOfBeds=" + numberOfBeds + "}";
    }
}
