package com.finalproject.java.designpattern.builder;

import com.designpattern.base.BikeInterface;

public class MountainBikeDirector extends BikeDirector {
    @Override
    public BikeInterface build(BikeBuilder builder) {
        builder.buildHandleBars();
        builder.buildWideTires();
        return builder.getBike();


    }

}