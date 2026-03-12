package vn.edu.qnu.example.structural.adapter;

import vn.edu.qnu.example.structural.adapter.lib.UKCarPriceCalculator;

public class Main {
    public static void main(String[] args) {
        CarPriceCalculator carPrice = new CarPriceCalculator();
        TruckPriceCalculator truckPrice = new TruckPriceCalculator();

        UKCarPriceCalculator ukCalulator = new UKCarPriceCalculator();

        UKPriceAdapter adapter = new UKPriceAdapter(ukCalulator);

    }
}