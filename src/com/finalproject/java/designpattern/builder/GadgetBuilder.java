package com.finalproject.java.designpattern.builder;

import com.designpattern.base.GadgetInterface;
import com.designpattern.base.MountainBike;

public class GadgetBuilder extends BikeBuilder {

    private MountainBike bikeInProgress;

    public GadgetBuilder(MountainBike bike) {
        this.bikeInProgress = bike;
    }

    @Override
    public GadgetInterface getBike() {
        return bikeInProgress;
    }

    @Override
    public void buildHandleBars() {
        System.out.println("Installing Lights");
    }
    @Override
    public void buildWideTires() {
        System.out.println("Rearing Gears");
    }
    @Override
    public void buildWideTires() {
        System.out.println("Flipping Switches");
    }
}
