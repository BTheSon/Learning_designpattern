package vn.edu.qnu.example.structural.adapter;

public class TruckPriceCalculator implements PriceCalculator {
    @Override
    public float calculatePrice() {
        return 10.36f;
    }
}
