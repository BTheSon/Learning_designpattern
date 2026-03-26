package vn.edu.qnu.example.structural.bridge.shape;

import vn.edu.qnu.example.structural.bridge.properties.Color;
import vn.edu.qnu.example.structural.bridge.properties.Size;

public class Square extends Shape{

    public Square(Color color, Size size) {
        super(color, size);
    }

    @Override
    public void draw() {
        super.draw();
    }

    @Override
    protected String shapename() {
        return "Vuong";
    }
}
