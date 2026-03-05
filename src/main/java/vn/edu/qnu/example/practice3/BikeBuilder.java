package vn.edu.qnu.example.practice3;

import vn.edu.qnu.example.practice3.factory.BikeFactory;
import vn.edu.qnu.example.practice3.factory.MoutainBikeFactory;
import vn.edu.qnu.example.practice3.factory.RoadBikeFactory;

public class BikeBuilder {
    public static void main(String[] args) {
        BikeFactory moutainBikeFactory = new MoutainBikeFactory();
        BikeFactory roadBikeFactory = new RoadBikeFactory();

        var roadWheel = roadBikeFactory.getWheel();
        var moutainWheel = moutainBikeFactory.getWheel();
    }
}
