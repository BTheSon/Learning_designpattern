package vn.edu.qnu.example.abtract_factory;

import vn.edu.qnu.example.abtract_factory.factory.BikeFactory;
import vn.edu.qnu.example.abtract_factory.factory.MoutainBikeFactory;
import vn.edu.qnu.example.abtract_factory.factory.RoadBikeFactory;

public class BikeBuilder {
    public static void main(String[] args) {
        BikeFactory moutainBikeFactory = new MoutainBikeFactory();
        BikeFactory roadBikeFactory = new RoadBikeFactory();

        var roadWheel = roadBikeFactory.getWheel();
        var moutainWheel = moutainBikeFactory.getWheel();
    }
}
