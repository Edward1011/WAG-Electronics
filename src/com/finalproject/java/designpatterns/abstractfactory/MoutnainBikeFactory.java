package com.finalproject.java.designpatterns.abstractfactory;

public class MoutnainBikeFactory extends  AbstractBikeFactory{
    @Override
   public BikeFrameInterface createFrame() {
        return new MountainFrame();
    }

    @Override
   public BikeSeatInterface createSeat(){
        return new MountainSeat();

    }
}
