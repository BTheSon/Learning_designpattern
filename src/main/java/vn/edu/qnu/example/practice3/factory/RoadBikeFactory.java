package vn.edu.qnu.example.practice3.factory;

import vn.edu.qnu.example.practice3.saddle.BigSaddle;
import vn.edu.qnu.example.practice3.saddle.Saddle;
import vn.edu.qnu.example.practice3.saddle.SmallSaddle;
import vn.edu.qnu.example.practice3.wheel.RoadBikeWheel;
import vn.edu.qnu.example.practice3.wheel.Wheel;

public class RoadBikeFactory extends BikeFactory{
    @Override
    public Wheel getWheel() {
        return new RoadBikeWheel();
    }

    @Override
    public Saddle getSaddle() {
        return new BigSaddle();
    }
}
