package com.finalproject.java.designpatterns.singlton;

public class SerialNumberGenerator {
    private static SerialNumberGenerator instance;
    private int count = 635224;

    public synchronized static SerialNumberGenerator getInstance() {
        if(instance == null) {
            instance = new SerialNumberGenerator();
        }//end of statement
        return instance;
    }//end method
    private SerialNumberGenerator(){ }

    public synchronized int getNextSerial() { return ++count;}

}//end class
