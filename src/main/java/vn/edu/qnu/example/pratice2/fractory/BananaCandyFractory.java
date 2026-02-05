package vn.edu.qnu.example.pratice2.fractory;

import vn.edu.qnu.example.pratice2.candy.BananaCandy;
import vn.edu.qnu.example.pratice2.candy.Candy;

public class BananaCandyFractory extends CandyFactory {
    @Override
    Candy createCandy() {
        return new BananaCandy();
    }
}
