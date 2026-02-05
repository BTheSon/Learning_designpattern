package vn.edu.qnu.example.pratice2.fractory;

import vn.edu.qnu.example.pratice2.candy.Candy;
import vn.edu.qnu.example.pratice2.candy.ValentineCandy;

public class ValentineCandyFactory extends CandyFactory {
    @Override
    public Candy createCandy() {
        return new ValentineCandy();
    }
}
