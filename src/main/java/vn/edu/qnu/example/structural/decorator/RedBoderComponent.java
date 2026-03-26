package vn.edu.qnu.example.structural.decorator;

public class RedBoderComponent extends Decorator{

    public RedBoderComponent(Component decoratedComponent) {
        super(decoratedComponent);
    }

    @Override
    public void draw() {
        decoratedComponent.draw();
        System.out.println("--> Add red border");
    }
}
