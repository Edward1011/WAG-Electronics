package com.finalproject.java.Decorator;

import com.designpattern.base.AbstractBike;
import com.designpattern.base.BikeInterface;

public class AbstractWidgetOption extends AbstractBike {
    protected BikeInterface decoratedbike;

    public AbstractWidgetOption(BikeInterface bike) {
        super(bike.getWheel());
        this.decoratedbike = bike;
    }
}
