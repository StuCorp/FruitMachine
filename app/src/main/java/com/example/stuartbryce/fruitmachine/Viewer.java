package com.example.stuartbryce.fruitmachine;

import java.util.ArrayList;

import fruitSelections.Fruit;

/**
 * Created by stuartbryce on 2017-06-30.
 */

public class Viewer {

    Player player;
    Machine machine;
    ArrayList<Wheel> wheels;

    public Viewer(Player player, Machine machine){
        this.player = player;
        this.machine = machine;
        this.wheels = machine.getWheels();
    }


    public void printCurrentPosition(){
        for (Wheel wheel : wheels){
            System.out.print(wheel.getLastFruit ());
            System.out.print(" | ");
        }
        System.out.println();

        for (Wheel wheel : wheels){
            System.out.print(wheel.getCurrentFruit());
            System.out.print(" | ");
        }
        System.out.println();


        for (Wheel wheel : wheels){
            System.out.print(wheel.getNextFruit());
            System.out.print(" | ");
        }
        System.out.println();
    }

    public void pull() {
        System.out.println();
        System.out.println("Hit enter to pull!");
    }

    public void welcome() {
        System.out.println("welcome fruit salad");
    }

    public void youWin() {
        System.out.println("********************************");
        System.out.println("You've money an amount of money!");
        System.out.println("********************************");
    }

    public void moneyPlease() {
        System.out.println("£1 per spin. Enter an amount.");
    }

    public void status(Player player, Machine machine) {
        System.out.print(String.format("Your Wallet: £%d", player.getMoneyAmount()));
        System.out.print(" | ");
        System.out.print(String.format("In machine: £%d", machine.getUserMoney()));
        System.out.print(" | ");
        System.out.print(String.format("Your earnings so far: £%d", machine.getPayOutTracker()));
        System.out.println(" | ");
        System.out.print(String.format("Nudges: %d", machine.getNudges()));
        System.out.print(" | ");
        System.out.print(String.format("Holds: %d", machine.getHoldsNum()));
        System.out.println(" | ");

    }

    public void thanks() {
        System.out.println("Thanks!");
    }

    public void printWheelNumbers() {
        printCurrentPosition();
        System.out.println("Wheel 1 | Wheel 2 | Wheel 3 ");
    }

    public void youHaveNudge() {
        System.out.println("You have a nudge!");
    }

    public void chooseWheel() {
        System.out.println("Please select wheel 1, 2 or 3! Or 0 to spin!");
    }

    public void youHaveHold() {
        System.out.println("You have a hold");
    }

    public void holdingWheels(ArrayList<Integer> wheelsToBeHeld) {
        for (Integer wheelNum : wheelsToBeHeld) {
            System.out.println(String.format("Holding wheel %d", wheelNum +1));
        }
        System.out.println("Hit enter to spin");
    }


    public void whatYouGot() {
        System.out.print("You have ");
        System.out.print(String.format("Nudges: %d", machine.getNudges()));
        System.out.print(" | ");
        System.out.print(String.format("Holds: %d", machine.getHoldsNum()));
        System.out.println(" | ");
    }

    public void options() {
        System.out.println();
        System.out.print("Your options are ");
        if (machine.getNudges() > 0) {
            System.out.print("1) Nudge");
            System.out.print(" | ");
        }
        if (machine.getHoldsNum() > 0) {
            System.out.print("2) Hold");
            System.out.print(" | ");
        }
        System.out.print("3) Nope");
        System.out.println(" | ");

    }

    public void keepPlaying() {
        System.out.println("Do you want to keep playing?");
        System.out.println("'nope' to quit or enter to carry on");
    }
}
