package vn.edu.qnu.example.structural.decorator;

public class BluePanddingComponent extends Decorator{

    public BluePanddingComponent(Component decoratedComponent) {
        super(decoratedComponent);
    }

    @Override
    public void draw() {
        decoratedComponent.draw();
        System.out.println("--> Add blue paddding");
    }
}
