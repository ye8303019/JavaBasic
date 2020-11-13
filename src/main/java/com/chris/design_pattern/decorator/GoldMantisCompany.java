package com.chris.design_pattern.decorator;

/**
 * Created by ye830 on 4/6/2018.
 */
public class GoldMantisCompany extends DecorateCompany {
    public GoldMantisCompany(House house){
        super(house);
    }

    @Override
    public void decorate(){
        super.decorate();
        System.out.println("We decorate your washroom.");
    }
}
