package com.finalproject.java.designpattern.facade;

import com.designpattern.base.BikeInterface;
import com.designpatterns.singlton.SerialNumberGenerator;

public class Registration {
    private BikeInterface bike;

    Registration(BikeInterface bike) {
        this.bike = bike;
    }

    public void allocatingBikeNumber() {
        SerialNumberGenerator generator = SerialNumberGenerator .getInstance();
        System.out.println("Allocating Bike Number "+generator .getNextSerial());
    }

}

/*public class Registration {
    private GadgetInterface gadget;

    Registration(GadgetInterface gadget) {
        this.gadget = gadget;
    }

    public void allocatingGadgetNumber() {
        SerialNumberGenerator generator = SerialNumberGenerator .getInstance();
        System.out.println("Allocating Gadget Number "+generator .getNextSerial());
    }

}
*/