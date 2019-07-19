package com.finalproject.java.designpatterns.ObserverTwo;

import java.util.EventObject;

public class SpeedoMeterEvent extends EventObject {
    private int speed;

    public SpeedoMeterEvent(Object obj, int speed) {
        super(obj);
        this.speed = speed;
    }

    public int getSpeed() { return speed;}
}
