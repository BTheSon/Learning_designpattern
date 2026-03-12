package vn.edu.qnu.example.creational.builder.builder;

import vn.edu.qnu.example.creational.builder.Bedroom;

public class BedroomBuilder {

    private String bedType = "unknown";
    private int numberOfBeds = 0;
    private boolean hasBalcony = false;
    private boolean hasBathroom = false;
    private int size = 0;
    private String wallColor = "white";
    private boolean hasTV = false;
    private boolean hasAC = false;

    public BedroomBuilder setBedType(String bedType) {
        this.bedType = bedType;
        return this;
    }

    public BedroomBuilder setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
        return this;
    }

    public BedroomBuilder setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
        return this;
    }

    public BedroomBuilder setHasBathroom(boolean hasBathroom) {
        this.hasBathroom = hasBathroom;
        return this;
    }

    public BedroomBuilder setSize(int size) {
        this.size = size;
        return this;
    }

    public BedroomBuilder setWallColor(String wallColor) {
        this.wallColor = wallColor;
        return this;
    }

    public BedroomBuilder setHasTV(boolean hasTV) {
        this.hasTV = hasTV;
        return this;
    }

    public BedroomBuilder setHasAC(boolean hasAC) {
        this.hasAC = hasAC;
        return this;
    }

    public Bedroom createBedroom() {
        return new Bedroom(
                bedType,
                numberOfBeds,
                hasBalcony,
                hasBathroom,
                size,
                wallColor,
                hasTV,
                hasAC
        );
    }
}