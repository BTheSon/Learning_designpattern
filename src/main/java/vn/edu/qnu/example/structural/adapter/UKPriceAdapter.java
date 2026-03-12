package vn.edu.qnu.example.structural.adapter;

import vn.edu.qnu.example.structural.adapter.lib.UKCarPriceCalculator;

public class UKPriceAdapter implements PriceCalculator{
    private final UKCarPriceCalculator ukCarPriceCalculator;
    private float rate = 1.3F;

    public UKPriceAdapter(UKCarPriceCalculator ukCarPriceCalculator) {
        this.ukCarPriceCalculator = ukCarPriceCalculator;
    }

    @Override
    public float calculatePrice() {
        return ukCarPriceCalculator.getPrice() * rate;
    }
}
