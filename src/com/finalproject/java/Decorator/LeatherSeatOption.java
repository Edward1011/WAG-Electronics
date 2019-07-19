package com.finalproject.java.Decorator;

import com.designpattern.base.BikeInterface;

public class LeatherSeatOption extends AbstractWidgetOption {
    public LeatherSeatOption(BikeInterface bike) {super(bike);}

    @Override
    public float getPrice(){
        return decoratedbike.getPrice() + 40.00F;

    }
}
