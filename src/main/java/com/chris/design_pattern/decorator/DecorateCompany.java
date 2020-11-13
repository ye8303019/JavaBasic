package com.chris.design_pattern.decorator;

/**
 * Created by ye830 on 4/6/2018.
 */
public class DecorateCompany implements House {

    private House house;

    public DecorateCompany(House house){
        this.house = house;
    }

    @Override
    public void decorate(){
        house.decorate();
    }
}
