package LLD_Problems.Snake_And_Ladder;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    private int diceCnt, miVal, mxVal;

    public Dice(int diceCnt, int mxVal) {
        this.diceCnt = diceCnt;
        this.mxVal = mxVal;
        this.miVal = 1;
    }

    public int rollDice() {
        int sum = 0;
        for (int i = 0; i < diceCnt; i++) {
            sum += ThreadLocalRandom.current().nextInt(miVal, mxVal + 1);
        }
        return sum;
    }



}
