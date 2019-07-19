package com.finalproject.java.designpattern.facade;

import com.designpattern.base.BikeInterface;

public class BikeFacade {
    public void prepareForSale(BikeInterface bike) {
        Registration reg = new Registration(bike);
        reg.allocatingBikeNumber();
        Documentation.PrintBrochure();
        bike.airTire();
        bike.cleanFrame();
        bike.testRide();
    }
}

/*public class GadgetFacade {
    public void prepareForSale(GadgetInterface gadget) {
        Registration reg = new Registration(gadget);
        reg.allocatingGadgetNumber();
        Documentation.PrintReceipt();
        Gadget.verifyingPurchase();
        Gadget.checkingOrder();
        Gadget.inspectingParts();


    }
}

 */