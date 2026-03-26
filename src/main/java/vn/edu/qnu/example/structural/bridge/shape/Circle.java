package vn.edu.qnu.example.structural.bridge.shape;

import vn.edu.qnu.example.structural.bridge.properties.Color;
import vn.edu.qnu.example.structural.bridge.properties.Size;

public class Circle extends Shape{

    public Circle(Color color, Size size) {
        super(color, size);
    }

    @Override
    public void draw() {
        super.draw();
    }

    @Override
    protected String shapename() {
        return "Tron";
    }
}
