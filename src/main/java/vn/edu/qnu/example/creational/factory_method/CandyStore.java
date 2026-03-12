package vn.edu.qnu.example.creational.factory_method;

import vn.edu.qnu.example.creational.factory_method.fractory.ValentineCandyFactory;
import vn.edu.qnu.example.creational.factory_method.candy.Candy;
import vn.edu.qnu.example.creational.factory_method.fractory.BananaCandyFractory;
import vn.edu.qnu.example.creational.factory_method.fractory.CandyFactory;

import java.util.ArrayList;
import java.util.List;

public class CandyStore {

    public static void main(String[] args) {
        CandyFactory factory = null;
        List<Candy> storeCandies = new ArrayList<Candy>();

        // kẹo chuối
        factory = new BananaCandyFractory();
        storeCandies.add(factory.createCandy());

        // kẹo cho ngày 14/2
        factory = new ValentineCandyFactory();
        storeCandies.add(factory.createCandy());

        // hiển thị thông tin các kẹo trong kho
        for (Candy c : storeCandies) {
            c.displayInfo();
        }
    }
}
