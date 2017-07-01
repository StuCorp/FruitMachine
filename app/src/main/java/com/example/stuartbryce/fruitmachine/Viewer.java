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


    public void printCurrentPosition(ArrayList<Wheel> wheels){
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
        System.out.println("Hit enter to pull or type 'quit' to quit");
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

    }

    public void thanks() {
        System.out.println("Thanks!");
    }
}
