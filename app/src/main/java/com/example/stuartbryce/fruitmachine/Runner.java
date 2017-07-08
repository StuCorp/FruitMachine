package com.example.stuartbryce.fruitmachine;

/**
 * Created by stuartbryce on 2017-06-30.
 */

public class Runner {

    public static void main(String[] args) {
        Player player = new Player(20);
        FruitPack fruitPack = new FruitPack();
        HatPack hatPack = new HatPack();
        WheelSet wheelSet = new WheelSet(hatPack, 3);
        Machine machine = new Machine(wheelSet);
        Viewer viewer = new Viewer(player, machine);
        Game game = new Game(player, machine, viewer);

        game.run();

    }
}
