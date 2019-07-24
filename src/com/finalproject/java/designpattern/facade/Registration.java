package com.finalproject.java.designpattern.facade;

import com.finalproject.base.GadgetInterface;
import singleton.SerialNumber;

public class Registration {
    private GadgetInterface gadget;

    Registration(GadgetInterface gadget) {
        this.gadget = gadget;
    }

    public void allocatingGadgetNumber() {
        SerialNumberGenerator generator = SerialNumberGenerator .getInstance();
        System.out.println("Allocating Gadget Number "+generator .getNextSerial());
    }

}
