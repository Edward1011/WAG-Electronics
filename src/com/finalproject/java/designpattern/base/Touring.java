package com.finalproject.java.designpattern.base;

import com.designpattern.java.BikeColor;

public class Touring extends RoadBike {

    public Touring(WheelInterface wheel, BikeColor color){
        super(wheel,color);
    }
    public Touring(WheelInterface wheel){
        this(wheel, BikeColor.BLUE);
    }

    @Override
    public float getPrice() {
        return 780.00f;
    }
}
