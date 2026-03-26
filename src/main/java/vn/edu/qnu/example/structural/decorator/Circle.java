package vn.edu.qnu.example.structural.decorator;

public class Circle implements Component{
    @Override
    public void draw() {
        System.out.println("circle has draw");
    }
}
