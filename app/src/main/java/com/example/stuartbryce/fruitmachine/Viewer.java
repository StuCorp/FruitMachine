package com.example.stuartbryce.fruitmachine;

import java.util.ArrayList;

/**
 * Created by stuartbryce on 2017-06-30.
 */

public class Viewer {


    public int printCurrentPosition(ArrayList<Wheel> wheels){
        for (Wheel wheel : wheels){
            System.out.print(wheel.getNextFruit ());
            System.out.print(" | ");
        }
        System.out.println();

        for (Wheel wheel : wheels){
            System.out.print(wheel.getCurrentFruit());
            System.out.print(" | ");
        }
        System.out.println();


        for (Wheel wheel : wheels){
            System.out.print(wheel.getLastFruit());
            System.out.print(" | ");
        }
        return 1;
    }

    public void pull() {
        System.out.println();
        System.out.println("Hit enter to pull or type 'quit' to quit");
    }

    public void welcome() {
        System.out.println("welcome fruit salad");
    }

    public void youWin() {
        System.out.println("You've money an amount of money!");
    }
}
