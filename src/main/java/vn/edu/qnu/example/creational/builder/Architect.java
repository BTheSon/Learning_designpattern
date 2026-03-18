package vn.edu.qnu.example.creational.builder;

import vn.edu.qnu.example.creational.builder.builder.BedroomBuilder;
import vn.edu.qnu.example.creational.builder.builder.HouseBuilder;
import vn.edu.qnu.example.creational.builder.builder.LivingRoomBuilder;
import vn.edu.qnu.example.creational.builder.builder.NewBedroomBuilder;

public class Architect {
    public static void main(String[] args) {
        // Simple Builder usage
        System.out.println("--- Simple Builder ---");
        Bedroom simpleRoom = new BedroomBuilder()
                .setBedType("King Size")
                .setNumberOfBeds(1)
                .setHasAC(true)
                .setWallColor("Blue")
                .createBedroom();
        System.out.println("Created room: " + simpleRoom);

        // Complex HouseBuilder usage
        System.out.println("\n--- Complex HouseBuilder ---");
        House house = new HouseBuilder()
                .setFloors(2)
                .addRoomBuilder(new NewBedroomBuilder()
                        .setBedType("Queen Size")
                        .setSize(20)
                        .setWallColor("White"))
                .addRoomBuilder(new LivingRoomBuilder()
                        .setHasFireplace(true)
                        .setSize(40)
                        .setWallColor("Beige"))
                .build();

        System.out.println(house);
    }
}
