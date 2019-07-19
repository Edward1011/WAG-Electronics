package com.finalproject.java.designpatterns.ObserverTwo;

public class SpeedMonitor implements SpeedoMeterListener {
    public static final int SPEED_TO_ALERT = 30;


    @Override
    public void speedChange(SpeedoMeterEvent event) {
        if(event.getSpeed() > SPEED_TO_ALERT){
            System.out.println("**ALERT** Riding too fast! ("+event.getSpeed() + ")");
        } else {
            System.out.println("..nice and steady..("+event.getSpeed() + ")");
        }
    }

}
