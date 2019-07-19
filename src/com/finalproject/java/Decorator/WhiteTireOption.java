package com.finalproject.java.Decorator;

import com.designpattern.base.BikeInterface;

public class WhiteTireOption extends AbstractWidgetOption {

    public WhiteTireOption(BikeInterface bike) { super(bike);}

    @Override
    public float getPrice() {
        return decoratedbike.getPrice() + 80.00F;
    }
}
