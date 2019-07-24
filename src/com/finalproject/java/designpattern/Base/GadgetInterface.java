package com.finalproject.java.designpattern.Base;

import com.finalproject.java.GadgetColor;



public interface GadgetInterface {



    WidgetInterface getWidget();

    GadgetColor getColor();

    float getPrice();

    void paint(GadgetColor color);



    void typeSwitch();

    void typeButton();

    void typeLight();

}