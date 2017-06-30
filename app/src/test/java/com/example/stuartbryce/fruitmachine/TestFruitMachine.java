package com.example.stuartbryce.fruitmachine;

import org.junit.Before;
import org.junit.Test;
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
        viewer = new Viewer();
        machine = new Machine();
        game = new Game(player, machine, viewer);
    }

    @Test
    public void testPrintOut(){

        assertEquals(2 ,viewer.printCurrentPosition(machine.getWheels()));

    }

}
