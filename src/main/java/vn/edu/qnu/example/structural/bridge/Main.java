package vn.edu.qnu.example.structural.bridge;

import vn.edu.qnu.example.structural.bridge.properties.Blue;
import vn.edu.qnu.example.structural.bridge.properties.Medium;
import vn.edu.qnu.example.structural.bridge.properties.Red;
import vn.edu.qnu.example.structural.bridge.properties.Small;
import vn.edu.qnu.example.structural.bridge.shape.Circle;
import vn.edu.qnu.example.structural.bridge.shape.Shape;
import vn.edu.qnu.example.structural.bridge.shape.Square;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(new Red(), new Medium());
        Shape square = new Square(new Blue(), new Small());

        circle.draw();
        square.draw();
    }
}
