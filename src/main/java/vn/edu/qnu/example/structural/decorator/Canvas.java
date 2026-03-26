package vn.edu.qnu.example.structural.decorator;

public class Canvas {
    public static void main(String[] args) {
        Component circle =
                new BluePanddingComponent(
                        new RedBoderComponent(
                                new Circle()
                        )
                );
        circle.draw();
    }
}
