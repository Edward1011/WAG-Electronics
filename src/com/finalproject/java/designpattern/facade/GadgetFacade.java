package com.finalproject.java.designpattern.facade;

import com.designpattern.base.BikeInterface;

public class GadgetFacade {
    public void prepareForSale(GadgetInterface gadget) {
        Registration reg = new Registration(gadget);
        reg.allocatingGadgetNumber();
        Documentation.PrintReceipt();
        Gadget.VerifyingPurchase();
        Gadget.CheckingOrder();
        Gadget.InspectingParts();

        gadget.Switch();

        gadget.Button();

        gadget.Light();
    }
}