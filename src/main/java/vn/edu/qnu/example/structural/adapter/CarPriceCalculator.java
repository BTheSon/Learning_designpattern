package vn.edu.qnu.example.structural.adapter;

public class CarPriceCalculator implements PriceCalculator {
    @Override
    public float calculatePrice() {
        return 3.6f;
    }
}
