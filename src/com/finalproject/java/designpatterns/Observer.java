package com.finalproject.java.designpatterns;

public class Observer { package observer;



import java.util.Observable;



    public class Inventory {

    }



    public class Speedometer extends Observable {

        private int currentSpeed;



        public Speedometer(){ //Constructors

            currentSpeed = 0;

        } //end constructor



        public int getCurrentSpeed(){  //getter

            return currentSpeed;

        } //end getter



        public void setCurrentSpeed(int speed) {

            this.currentSpeed = speed;



            setChanged();

            notifyObservers();

        } //end method

    } //end class
}
