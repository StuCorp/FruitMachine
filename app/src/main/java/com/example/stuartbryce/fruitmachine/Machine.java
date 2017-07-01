package com.example.stuartbryce.fruitmachine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import fruitSelections.Fruit;

/**
 * Created by stuartbryce on 2017-06-30.
 */

public class Machine {

    private Wheel wheel1;
    private Wheel wheel2;
    private Wheel wheel3;
    private ArrayList<Wheel> wheels;
    private int nudges;
    private int holds;
    private int cashSupply;
    private int userMoney;
    private int payOutTracker;


    public Machine() {
        wheel1 = new Wheel();
        wheel2 = new Wheel();
        wheel3 = new Wheel();
        this.wheels = new ArrayList<>(Arrays.asList((Wheel) wheel1, wheel2, wheel3));
        this.nudges = 0;
        this.holds = 0;
        this.cashSupply = 100;
        this.userMoney = 0;
        this.payOutTracker = 0;
    }

    public void spin(Wheel wheel) {
        int spins = getSpinNum();
        Collections.rotate(wheel.getWheel(), spins);
    }

    public int getSpinNum() {

        int arrayLength = Fruit.values().length;
        Random rand = new Random();
        int spins = rand.nextInt(arrayLength);
        return spins;
    }

    public void spinAll() {
        for (Wheel wheel : wheels) {
            spin(wheel);
        }
    }

    public void nudge(Wheel wheel) {
        Collections.rotate(wheel.getWheel(), 1);
    }

    public boolean checkForWin() {
        if ((wheel1.getCurrentFruit() == wheel2.getCurrentFruit()) && (wheel1.getCurrentFruit() == wheel3.getCurrentFruit())) {
            return true;
        } else {
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

    public ArrayList<Integer> getHolds() {
        ArrayList<Integer> holds = new ArrayList<>();
        while (UserInput.getBoolean()) {
            holds.add(UserInput.getUserInt());
        }
        return holds;
    }

    public ArrayList<Wheel> getWheels() {
        return wheels;
    }

    public void payPlayer(Player player) {
//        checkValue of enum eventually
        int amount = 5;
        player.receiveMoney(amount);
        this.cashSupply -= amount;
        this.payOutTracker += amount;
    }

    public int getCashSupply() {
        Integer cashSupply = new Integer(this.cashSupply);
        return cashSupply;
    }

    public int getUserMoney(){
        Integer userMoneyInMachine = new Integer(this.userMoney);
        return  userMoneyInMachine;
    }

    public void addMoney(int moneyAdded) {
        userMoney += moneyAdded;
    }

    public int getPayOutTracker() {
        Integer payOutAmount = new Integer(payOutTracker);
        return payOutAmount;
    }
}
