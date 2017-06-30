package com.example.stuartbryce.fruitmachine;

import java.util.ArrayList;

import fruitSelections.Fruit;

/**
 * Created by stuartbryce on 2017-06-30.
 */

public class Wheel {

    private ArrayList<Fruit> wheel;

    public Wheel(){
        this.wheel = new ArrayList<>();
        fillWheel();
    }

    public void fillWheel(){
        for (Fruit fruit : Fruit.values()){
            this.wheel.add(fruit);
        }
    }

    public Fruit getCurrentFruit(){
        return this.wheel.get(0);
    }

    public Fruit getNextFruit(){
        return this.wheel.get(wheel.size()-1);
    }

    public Fruit getLastFruit(){
        return this.wheel.get(1);
    }


    public ArrayList<Fruit> getWheel() {
        return wheel;
    }
}


