package vn.edu.qnu.example.practice3.factory;

import vn.edu.qnu.example.practice3.saddle.BigSaddle;
import vn.edu.qnu.example.practice3.saddle.Saddle;
import vn.edu.qnu.example.practice3.saddle.SmallSaddle;
import vn.edu.qnu.example.practice3.wheel.MountainBikeWheel;
import vn.edu.qnu.example.practice3.wheel.Wheel;

public class MoutainBikeFactory extends BikeFactory {
    @Override
    public Wheel getWheel() {
        return new MountainBikeWheel();
    }

    @Override
    public Saddle getSaddle() {
        return new SmallSaddle();
    }
}
