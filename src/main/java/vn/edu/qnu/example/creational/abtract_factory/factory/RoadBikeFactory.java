package vn.edu.qnu.example.creational.abtract_factory.factory;

import vn.edu.qnu.example.creational.abtract_factory.saddle.BigSaddle;
import vn.edu.qnu.example.creational.abtract_factory.saddle.Saddle;
import vn.edu.qnu.example.creational.abtract_factory.wheel.RoadBikeWheel;
import vn.edu.qnu.example.creational.abtract_factory.wheel.Wheel;

public class RoadBikeFactory implements BikeFactory{
    @Override
    public Wheel getWheel() {
        return new RoadBikeWheel();
    }

    @Override
    public Saddle getSaddle() {
        return new BigSaddle();
    }
}
