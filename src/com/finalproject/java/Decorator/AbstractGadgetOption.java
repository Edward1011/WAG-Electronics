package com.finalproject.java.Decorator;

import com.designpattern.base.AbstractBike;
import com.designpattern.base.BikeInterface;

public class AbstractGadgetOption extends AbstractBike {
    protected BikeInterface decoratedbike;

    public AbstractGadgetOption(BikeInterface bike) {
        super(bike.getWheel());
        this.decoratedbike = bike;
    }
}
