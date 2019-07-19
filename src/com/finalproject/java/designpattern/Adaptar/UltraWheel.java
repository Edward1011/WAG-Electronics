package com.finalproject.java.designpattern.Adaptar;

public class UltraWheel {
    private int size;

    public UltraWheel(int size) {
        this.size = size;
    }

    public int getWheelSize() {
        return size;
    }

    @Override
    public String toString() {
        return "ULTRA WHEEL" + " (" + size + ") inches";
    }

    }

