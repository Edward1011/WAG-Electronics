package com.finalproject.java.designpattern.base;

import com.designpattern.java.BikeColor;

public abstract class RoadBike extends AbstractBike {

    protected RoadBike(WheelInterface wheel, BikeColor color){
        super(wheel,color);
    }

    protected RoadBike(WheelInterface wheel){
        this(wheel,BikeColor.ORANGE);
    }

    @Override
    public float getPrice() {
        return 670.00F;
    }
}
