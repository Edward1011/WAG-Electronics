package com.finalproject.java.designpattern.java;
import com.DesingPattern.Decorator.CustomGripOption;
import com.DesingPattern.Decorator.GoldFrameOption;
import com.designpattern.Adaptar.UltraWheel;
import com.designpattern.Adaptar.UltraWheelAdaptar;
import com.designpattern.Behavioral.MountainBikeRange;
import com.designpattern.Behavioral.RoadBikeRange;
import com.designpattern.Observer.GearBox;
import com.designpattern.Observer.SpeedMonitor;
import com.designpattern.Observer.Speedometer;
import com.designpattern.base.*;
import com.designpattern.builder.BikeBuilder;
import com.designpattern.builder.BikeDirector;
import com.designpattern.builder.RoadBikeBuilder;
import com.designpattern.builder.RoadBikeDirector;
import com.designpattern.facade.BikeFacade;
import com.designpatterns.ObserverTwo.BikeGearBox;
import com.designpatterns.abstractfactory.AbstractBikeFactory;
import com.designpatterns.abstractfactory.BikeFrameInterface;
import com.designpatterns.abstractfactory.BikeSeatInterface;
import com.designpatterns.abstractfactory.RoadBikeFactory;
import com.designpatterns.singlton.SerialNumberGenerator;
import com.designpatterns.visitor.WheelDiagnostics;
import com.designpatterns.visitor.WheelInventory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        //visitorExample();
        //observerExampleTwo();
        //observerExample();
        //iteratorExample2();
        //iteratorExample1();
        //facadeExample();
        //decoratorExample();
        //singletonExample();
        //adapterExample();
        //builderExample();
        //abstractFactoryExample();
    }//end main method


    private static void visitorExample(){
        WheelInterface wheel = new WideWheel(24);
        wheel.acceptVisitor(new WheelDiagnostics());
        wheel.acceptVisitor(new WheelInventory());
    }
    private static void observerExampleTwo() {
        com.designpatterns.ObserverTwo.Speedometer speed =
                new com.designpatterns.ObserverTwo.Speedometer();
        speed.addSpeedoMeterListener(new com.designpatterns.ObserverTwo.SpeedMonitor());
        speed.addSpeedoMeterListener(new BikeGearBox());

        speed.setCurrentSpeed(5);
        speed.setCurrentSpeed(10);
        speed.setCurrentSpeed(20);
        speed.setCurrentSpeed(30);
        speed.setCurrentSpeed(35);

    }
    private static void observerExample() {
        SpeedMonitor monitor = new SpeedMonitor();
        Speedometer speed = new Speedometer();
        speed.addObserver(monitor);
        speed.addObserver(new GearBox());

        speed.setCurrentSpeed(5);
        speed.setCurrentSpeed(10);
        speed.setCurrentSpeed(15);
        speed.setCurrentSpeed(20);
        speed.setCurrentSpeed(26);
        speed.setCurrentSpeed(33);
    }

    private  static void iteratorExample2() {
        System.out.println("=== Our Mountain Bikes ===");
        MountainBikeRange bikeRange = new MountainBikeRange();

        for(BikeInterface bike : bikeRange.getRange()) {
            System.out.println(bike);
        }
    }

    private static void iteratorExample1(){
        System.out.println("=== Our Road Bikes ===");
        RoadBikeRange bikeRange = new RoadBikeRange();
        printIterator(bikeRange.iterator());

    }

    private static void printIterator(Iterator iter) {
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

private static void facadeExample() {
    BikeFacade facade = new BikeFacade();
    facade.prepareForSale(new DownHill(new WideWheel(24)));
}
    private static void decoratorExample() {
        BikeInterface myTourBike = new Touring(new NarrowWheel(24));
        System.out.println(myTourBike);

        myTourBike = new CustomGripOption(myTourBike);
        System.out.println(myTourBike);

        myTourBike = new GoldFrameOption(myTourBike);
        System.out.println(myTourBike);
        }

    private static void adapterExample() {
        UltraWheel ultrawheel = new UltraWheel(28);
        List<WheelInterface> wheels = new ArrayList<>();
        wheels.add(new NarrowWheel(24));
        wheels.add(new NarrowWheel(20));
        wheels.add(new WideWheel(24));
        wheels.add(new UltraWheelAdaptar(ultrawheel));
        wheels.add(new UltraWheelAdaptar(new UltraWheel(26)));

        for (WheelInterface wheel : wheels) {
            System.out.println(wheel);
        }
    }
    private static void singletonExample() {

        System.out.println("Generating Serial Numbers");
    SerialNumberGenerator generator = SerialNumberGenerator.getInstance();
    System.out.println("next seral = "+generator.getNextSerial());
    System.out.println("next seral = "+generator.getNextSerial());
    System.out.println("next seral = "+generator.getNextSerial());
    System.out.println("next seral = "+generator.getNextSerial());
}//end method

    private static void builderExample(){
    RoadBike bike = new Touring(new NarrowWheel(22));
        BikeBuilder builder = new RoadBikeBuilder(bike);
        BikeDirector director = new RoadBikeDirector();
        BikeInterface bikeInterface = director.build(builder);
        System.out.println(bikeInterface);

    }

    private static void abstractFactoryExample(){
        AbstractBikeFactory factory = new RoadBikeFactory();
        BikeFrameInterface frame = factory.createFrame();
        BikeSeatInterface seat = factory.createSeat();

        System.out.println(frame.getFrameParts());
        System.out.println(seat.getSeatParts());
    }

}//end class
