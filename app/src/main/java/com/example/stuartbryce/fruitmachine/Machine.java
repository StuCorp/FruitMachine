package com.example.stuartbryce.fruitmachine;

import java.util.ArrayList;

/**
 * Created by stuartbryce on 2017-06-30.
 */

public class Machine {

    Wheel wheel1;
    Wheel wheel2;
    Wheel wheel3;
    ArrayList<Wheel> wheels;

    public Machine(){
        this.wheels = new ArrayList<>();
    }



    public void spinAll(){
        for (Wheel wheel : wheels){
            wheel.spin(wheel);
        }
    }

    boolean checkForWin(){
        if ((wheel1.getCurrentFruit() == wheel2.getCurrentFruit()) && (wheel1.getCurrentFruit() == wheel3.getCurrentFruit())) {
            return true;
        }
        else{
            return false;
        }

    }

}
