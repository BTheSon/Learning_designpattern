package vn.edu.qnu.example.factory_method.fractory;

import vn.edu.qnu.example.factory_method.candy.Candy;
import vn.edu.qnu.example.factory_method.candy.ValentineCandy;

public class ValentineCandyFactory extends CandyFactory {
    @Override
    public Candy createCandy() {
        return new ValentineCandy();
    }
}
