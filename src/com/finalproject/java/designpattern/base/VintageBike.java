package com.finalproject.java.designpattern.base;

import com.designpattern.java.BikeColor;

public class VintageBike extends RoadBike {

    public VintageBike(WheelInterface wheel, BikeColor color) {
        super(wheel, color);
    }
    public VintageBike(WheelInterface wheel) {
        this(wheel, BikeColor.SHINY);
    }

    @Override
    public float getPrice() {
        return 600.00f;
    }
}
