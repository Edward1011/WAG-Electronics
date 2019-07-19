package com.finalproject.java.designpatterns.ObserverTwo;

import java.util.ArrayList;
import java.util.List;

public class Speedometer {
    private int currentSpeed;
    private List<SpeedoMeterListener> listeners;

    public Speedometer() {
        currentSpeed = 0;
        listeners = new ArrayList<>();
    }

    public void setCurrentSpeed(int speed) {
        this.currentSpeed = speed;
        firespeedChange();
    }
    public int getCurrentSpeed() { return currentSpeed;
    }

    public void addSpeedoMeterListener(SpeedoMeterListener obj){
        listeners.add(obj);
    }

    public void removeSpeedoMeterListener(SpeedoMeterListener obj) {
        listeners.remove(obj);
    }

    private void firespeedChange() {
        SpeedoMeterEvent speedEvent = new SpeedoMeterEvent(this,getCurrentSpeed());
        for(SpeedoMeterListener listen : listeners) {
            listen.speedChange(speedEvent);
        }
    }
}
