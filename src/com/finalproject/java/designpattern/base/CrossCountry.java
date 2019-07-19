package com.finalproject.java.designpattern.base;

import com.designpattern.java.BikeColor;

public class CrossCountry extends MountainBike {

    public CrossCountry(WheelInterface wheel, BikeColor color){
        super(wheel,color);
    }
    public CrossCountry(WheelInterface wheel){
        this(wheel, BikeColor.COPPER);
    }

    @Override
    public float getPrice() {
        return 850.00f;
    }
}