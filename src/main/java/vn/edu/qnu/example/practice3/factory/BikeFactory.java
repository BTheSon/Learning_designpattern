package vn.edu.qnu.example.practice3.factory;

import vn.edu.qnu.example.practice3.saddle.Saddle;
import vn.edu.qnu.example.practice3.wheel.Wheel;

public abstract class BikeFactory {
    public abstract Wheel getWheel();
    public abstract Saddle getSaddle();
}
