package com.finalproject.java.designpattern.builder;

import com.designpattern.base.BikeInterface;
import com.designpattern.base.RoadBike;

public class RoadBikeBuilder extends BikeBuilder {

    private RoadBike bikeInprogress;

    public RoadBikeBuilder (RoadBike bike) {
        this.bikeInprogress = bike;
    }

    @Override
    public BikeInterface getBike() {
        return bikeInprogress;
    }

    @Override
    public void buildHandleBars() {
        System.out.println("Building Handle Bars");
    }

    @Override
    public void buildStreetTires() {
        System.out.println("Building Street Tires");
    }
}
