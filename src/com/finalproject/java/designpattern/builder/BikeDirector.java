package com.finalproject.java.designpattern.builder;

import com.designpattern.base.BikeInterface;

public abstract class BikeDirector {
    public abstract BikeInterface build(BikeBuilder builder);
}
