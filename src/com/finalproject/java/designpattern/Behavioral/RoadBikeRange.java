package com.finalproject.java.designpattern.Behavioral;

import com.designpattern.base.BikeInterface;
import com.designpattern.base.NarrowWheel;
import com.designpattern.base.Touring;
import com.designpattern.base.VintageBike;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RoadBikeRange implements Iterable<BikeInterface> {
    private List<BikeInterface> bikes;

    public RoadBikeRange() {
        bikes = new ArrayList<>();

        bikes.add(new Touring(new NarrowWheel(22)));
        bikes.add(new Touring(new NarrowWheel(24)));
        bikes.add(new Touring(new NarrowWheel(26)));
        bikes.add(new VintageBike(new NarrowWheel(24)));
        bikes.add(new VintageBike(new NarrowWheel(22)));
    }// end abstractor

    public List<BikeInterface> getRange() {
    return bikes;
    }

    @Override
    public Iterator<BikeInterface> iterator() {
        return bikes.listIterator();
    }
} //end class


