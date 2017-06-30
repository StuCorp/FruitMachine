package com.example.stuartbryce.fruitmachine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/**
 * Created by stuartbryce on 2017-06-30.
 */

public class Machine {

    Wheel wheel1;
    Wheel wheel2;
    Wheel wheel3;
    ArrayList<Wheel> wheels;
    int nudges;
    int holds;
    int cashSupply;
    int userMoney;


    public Machine(){
        wheel1 = new Wheel();
        wheel2 = new Wheel();
        wheel3 = new Wheel();
        this.wheels = new ArrayList<>(Arrays.asList((Wheel) wheel1,wheel2,wheel3));
        this.nudges = 0;
        this.holds = 0;
        this.cashSupply = 100;
    }

    public void spin(Wheel wheel){
        int spins = getSpinNum();
        Collections.rotate(wheel.getWheel(), spins);
    }

    private int getSpinNum(){
        int min = 11;
        int max = 111;
        Random rand = new Random();
        int spins = rand.nextInt((max - min +1) + min);
        return spins;
    }

    public void spinAll(){
        for (Wheel wheel : wheels){
            spin(wheel);
        }
    }

    public void nudge(Wheel wheel){
        Collections.rotate(wheel.getWheel(), 1);
    }

    public boolean checkForWin(){
        if ((wheel1.getCurrentFruit() == wheel2.getCurrentFruit()) && (wheel1.getCurrentFruit() == wheel3.getCurrentFruit())) {
            return true;
        }
        else{
            return false;
        }
    }

    public void hold(ArrayList<Integer> wheelsToBeHeld) {
        ArrayList<Integer> allWheels = new ArrayList<>(Arrays.asList(0, 1, 2));
        for (Integer indexPop : wheelsToBeHeld) {
            allWheels.remove(indexPop);
        }
        for (Integer index : allWheels) {
            spin(wheels.get(index));
        }
    }

    public ArrayList<Integer> getHolds(){
        ArrayList<Integer> holds = new ArrayList<>();
        while(UserInput.getBoolean()) {
            holds.add(UserInput.getUserInt());
        }
        return holds;
    }

    public ArrayList<Wheel> getWheels() {
        return wheels;
    }

    public void payPlayer(Player player) {
//        checkValue of enum eventually
        player.receiveMoney(5);
    }
}
