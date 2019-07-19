package com.finalproject.java.Decorator;

import com.designpattern.base.BikeInterface;

public class CustomGripOption extends AbstractWidgetOption {
    public CustomGripOption(BikeInterface bike) { super(bike);}

    @Override
    public float getPrice() {
        return decoratedbike.getPrice() + 20.00F;
    }
}

