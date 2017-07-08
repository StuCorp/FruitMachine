package com.example.stuartbryce.fruitmachine;

import java.util.ArrayList;

import interfaces.Packable;

/**
 * Created by stuartbryce on 2017-07-08.
 */

public abstract class SymbolPack implements Packable {
    ArrayList<Symbol> pack;


    public ArrayList<Symbol> getPack() {
        return pack;
    }
}
