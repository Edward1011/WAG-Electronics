package com.finalproject.java.designpatterns.singlton;

public class SerialNumberWAG {
    private static SerialNumberWAG instance;
    private int count = 635224;

    public synchronized static SerialNumberWAG getInstance() {
        if(instance == null) {
            instance = new SerialNumberWAG();
        }//end of statement
        return instance;
    }//end method
    private SerialNumberWAG(){ }

    public synchronized int getNextSerial() { return ++count;}

}//end class
