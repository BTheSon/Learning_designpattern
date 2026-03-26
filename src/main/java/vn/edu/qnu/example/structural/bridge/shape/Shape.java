package vn.edu.qnu.example.structural.bridge.shape;

import vn.edu.qnu.example.structural.bridge.properties.Color;
import vn.edu.qnu.example.structural.bridge.properties.Size;

public abstract class Shape {
    protected Color color;
    protected Size size;
    public Shape(Color color, Size size) {
        this.color = color;
        this.size = size;
    }

    public void draw() {
        System.out.println("hinh " + this.shapename() + " dc ve voi thuoc tinh: ");
        System.out.println("Mau: " + color.fill());
        System.out.println("kich thuoc: " + size.area());
        System.out.println("===\n");
    }
    protected abstract String shapename();
}
