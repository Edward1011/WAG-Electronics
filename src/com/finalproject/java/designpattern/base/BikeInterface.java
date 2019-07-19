package com.finalproject.java.designpattern.base;

import com.designpattern.java.BikeColor;

public interface BikeInterface {
    WheelInterface getWheel();
    BikeColor getColor();
    float getPrice();

    void paint(BikeColor color);

void cleanFrame();
void airTire();
void testRide();
}

