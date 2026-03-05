package vn.edu.qnu.example.abtract_factory.factory;

import vn.edu.qnu.example.abtract_factory.saddle.Saddle;
import vn.edu.qnu.example.abtract_factory.saddle.SmallSaddle;
import vn.edu.qnu.example.abtract_factory.wheel.MountainBikeWheel;
import vn.edu.qnu.example.abtract_factory.wheel.Wheel;

public class MoutainBikeFactory implements BikeFactory {
    @Override
    public Wheel getWheel() {
        return new MountainBikeWheel();
    }

    @Override
    public Saddle getSaddle() {
        return new SmallSaddle();
    }
}
