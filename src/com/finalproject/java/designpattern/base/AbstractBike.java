package com.finalproject.java.designpattern.base;

import com.designpattern.java.BikeColor;

public abstract class AbstractBike implements BikeInterface{
    private WheelInterface wheel;
    private BikeColor color;

    protected AbstractBike(WheelInterface wheel, BikeColor color) {
        this.wheel=wheel;
        this.color=color;
    }

    protected AbstractBike(WheelInterface wheel) {
        this(wheel, BikeColor.UNPAINTED);
    }
    @Override
    public WheelInterface getWheel() {
        return wheel;
    }
    @Override
    public BikeColor getColor() {
        return color;
    }

    @Override
    public void paint(BikeColor color) {
        this.color=color;
    }

    @Override
    public float getPrice() {
        return 900.00F;
    }
    @Override
    public void cleanFrame() {
        System.out.println("Cleaning Frame...");
    }
        @Override
        public void airTire() {
        System.out.println("Airing Tires...");
        }
        @Override
        public void testRide() {
            System.out.println("Testing Bike...");
        }

    @Override
    public String toString() {
        return getClass().getSimpleName()+ "("+wheel+","+color+",price = $"+getPrice()+")";
    }
}



