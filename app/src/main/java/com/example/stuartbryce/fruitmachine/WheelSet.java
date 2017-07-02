package com.example.stuartbryce.fruitmachine;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by stuartbryce on 2017-07-02.
 */

public class WheelSet {

    private Wheel wheel1;
    private Wheel wheel2;
    private Wheel wheel3;
    private ArrayList<Wheel> wheels;

    public WheelSet(){
        wheel1 = new Wheel();
        wheel2 = new Wheel();
        wheel3 = new Wheel();
        this.wheels = new ArrayList<>(Arrays.asList((Wheel) wheel1, wheel2, wheel3));
    }

    public ArrayList<Wheel> getWheels() {
        return wheels;
    }
}