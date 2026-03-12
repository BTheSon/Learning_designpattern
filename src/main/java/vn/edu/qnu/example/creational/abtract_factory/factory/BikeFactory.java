package vn.edu.qnu.example.creational.abtract_factory.factory;

import vn.edu.qnu.example.creational.abtract_factory.saddle.Saddle;
import vn.edu.qnu.example.creational.abtract_factory.wheel.Wheel;

public interface BikeFactory {
    public abstract Wheel getWheel();
    public abstract Saddle getSaddle();
}
