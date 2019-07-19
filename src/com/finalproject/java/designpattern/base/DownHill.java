package com.finalproject.java.designpattern.base;

import com.designpattern.java.BikeColor;

public class DownHill extends MountainBike {

public DownHill(WheelInterface wheel, BikeColor color){
    super(wheel, color);
}
public DownHill(WheelInterface wheel) {
    this(wheel, BikeColor.RED);
}

    @Override
    public float getPrice() {
        return 870.00f;
    }
}
