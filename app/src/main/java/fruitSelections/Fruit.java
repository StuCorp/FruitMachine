package fruitSelections;

/**
 * Created by stuartbryce on 2017-06-30.
 */

public enum Fruit  {

    CHERRY(6),
    SEVEN(5),
    BAR(3),
    EGGPLANT(8);

    private int winAMount;

    Fruit(int winAMount){
        this.winAMount = winAMount;
    }

    public int getWinAMount() {
        return winAMount;
    }
}
