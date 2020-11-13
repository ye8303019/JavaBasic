package com.chris.design_pattern.decorator;

/**
 * Created by ye830 on 4/6/2018.
 */
public class Decorate {
    public static void main(String[] args) {
        House myHouse = new MyHouse();
        House ande = new AndeCompany(myHouse);
        House goldMatins = new GoldMantisCompany(ande);
        goldMatins.decorate();
    }
}
