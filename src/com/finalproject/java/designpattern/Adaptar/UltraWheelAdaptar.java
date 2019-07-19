package com.finalproject.java.designpattern.Adaptar;

import com.designpattern.base.AbstractWheel;

public class UltraWheelAdaptar extends AbstractWheel {
public UltraWheelAdaptar(UltraWheel ultrawheel)     {
    //public AbstractWheel(int size, boolean wide)
    super(ultrawheel.getWheelSize(), false);

}
}
