package vn.edu.qnu.example.structural.decorator;

abstract public class Decorator implements Component{
    protected Component decoratedComponent;

    public Decorator(Component decoratedComponent) {
        this.decoratedComponent = decoratedComponent;
    }

    @Override
    public void draw() {
        decoratedComponent.draw();
    }
}
