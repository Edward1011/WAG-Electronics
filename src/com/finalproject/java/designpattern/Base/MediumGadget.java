package com.finalproject.java.designpattern.Base;

public class MediumGadget extends AbstractGadget{

}



    public MediumGadget(WidgetInterface widget, GadgetColor color){

        super(widget, color);

    } //end method



    public MediumGadget(WidgetInterface widget) {

        this(widget, GadgetColor.PLAIN);

    } //end method



    @Override

    public float getPrice(){

        return 62.97f;

    } //end method

} //end class
