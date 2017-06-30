package com.example.stuartbryce.fruitmachine;

import java.util.ArrayList;

import static com.example.stuartbryce.fruitmachine.UserInput.getString;

/**
 * Created by stuartbryce on 2017-06-30.
 */

public class Game {


    Player player;
    Machine machine;
    Viewer viewer;
    Boolean game;
    ArrayList<Wheel> wheels;
    Boolean win;


    public Game(Player player, Machine machine, Viewer viewer) {
        this.player = player;
        this.machine = machine;
        this.viewer = viewer;
        this.game = true;
        this.wheels = machine.getWheels();
        this.win = false;
    }

    public void run() {
        machine.spinAll();
        viewer.welcome();
        while (game) {
//            while (machine.userMoney > 0)
            play();
        }

    }

    public void play() {
        while(!(win)){
            pull();
            boolean win = machine.checkForWin();
        }

        if (win) {
            viewer.youWin();
            machine.payPlayer(player);
        }
        System.exit(0);

    }

    public void pull() {
//        viewer.printCurrentPosition(wheels);
        viewer.pull();
        String answer = UserInput.getString();
        if (answer.equals("")) {
            machine.spinAll();
            viewer.printCurrentPosition(wheels);

        } else {
            this.game = false;
        }
    }

}
