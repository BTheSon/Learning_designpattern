package vn.edu.qnu.example.factory_method.fractory;

import vn.edu.qnu.example.factory_method.candy.BananaCandy;
import vn.edu.qnu.example.factory_method.candy.Candy;

public class BananaCandyFractory extends CandyFactory {
    @Override
    public Candy createCandy() {
        return new BananaCandy();
    }
}
