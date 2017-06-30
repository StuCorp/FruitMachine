package com.example.stuartbryce.fruitmachine;

/**
 * Created by stuartbryce on 2017-06-30.
 */

public class Game {



    run(while){

        while(machine.userMoney> 0) {
            play();
        }
    }

    play(){
        pull();
        checkForWin();
        hold();
    }


}
