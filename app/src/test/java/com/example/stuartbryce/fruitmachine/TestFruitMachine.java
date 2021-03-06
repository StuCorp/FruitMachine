package com.example.stuartbryce.fruitmachine;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import fruitSelections.Fruit;

import static org.junit.Assert.*;


/**
 * Created by stuartbryce on 2017-06-30.
 */

public class TestFruitMachine {

    Player player;
    Viewer viewer;
    Machine machine;
    Game game;


    @Before
    public void before() {
        player = new Player(20);
        machine = new Machine();
        viewer = new Viewer(player, machine);
        game = new Game(player, machine, viewer);
    }

//    @Test
//    public void testPrintOut(){
//
//        assertEquals(1 ,viewer.printCurrentPosition(machine.getWheels()));
//
//    }

    @Test
    public void checkForWinTest(){
      Wheel wheel1 = new Wheel();
      Wheel wheel2 = new Wheel();
      Wheel wheel3 = new Wheel();
        wheel1.setFruitAtZeroIndex(Fruit.BAR);
        wheel2.setFruitAtZeroIndex(Fruit.BAR);
        wheel3.setFruitAtZeroIndex(Fruit.BAR);
        assertEquals(true, machine.checkForWin());
    }

    @Test
//    need to get a test for random
    public void getSpinNumTest(){
        assertEquals(1, machine.getSpinNum());
    }
//
//    @Test
//    public void payPlayerTest(){
//
//        WheelSet wheels = new WheelSet();
//        WheelSet spyWheels = Mockito.spy(wheels);
//        Mockito.when(spyWheels.);
//    }

    @Test
    public void testFruitPackReturnPack(){
        FruitPack fruitpack = new FruitPack();
        ArrayList<Symbol> pack = fruitpack.getPack();
        assertEquals("cherry", pack.get(0).getName());
    }

}
