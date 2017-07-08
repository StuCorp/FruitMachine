package com.example.stuartbryce.fruitmachine;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import fruitSelections.Fruit;

/**
 * Created by stuartbryce on 2017-07-08.
 */

public class FruitPack extends SymbolPack {
    ArrayList<Symbol> pack;
    Symbol cherry;
    Symbol seven;
    Symbol bar;
    Symbol eggplant;

    public FruitPack(){
        cherry = new Symbol("cherry", 10, 12);
        seven = new Symbol("seven", 7, 12);
        bar = new Symbol("bar", 5, 12);
        eggplant = new Symbol("eggplant", 20, 12);
        this.pack = new ArrayList<>(Arrays.asList((Symbol) cherry, seven, bar, eggplant));
    }

    public ArrayList<Symbol> getPack() {
        return pack;
    }
}
