package com.finalproject.java.designpattern.builder;

import com.designpattern.base.BikeInterface;

public abstract class BikeBuilder {
    public abstract BikeInterface getBike();
    public void buildGear(){ }
    public void buildSwitch() { }
    public void buildLever() { }


    }//End class
