package LLD_Problems.Snake_And_Ladder;

import java.util.concurrent.ThreadLocalRandom;

public class Board {
    private int size, snakeCnt, ladderCnt;
    public Cell[][] cells;

    public Board(int size, int snakeCnt, int ladderCnt) {
        this.size = size;
        this.cells = new Cell[size][size];
        this.snakeCnt = snakeCnt;
        this.ladderCnt = ladderCnt;
        initialize();
    }

    public void initialize() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) cells[i][j] = new Cell();
        }
        addSnakeAndLadder();
    }

    public void addSnakeAndLadder() {
        while (snakeCnt > 0) {
            int start = ThreadLocalRandom.current().nextInt(0, size*size);
            int end = ThreadLocalRandom.current().nextInt(0, size*size);
            if (start <= end) continue;
            int r = start/size, c = start % size;
            if (cells[r][c].getJump() == null) {
                cells[r][c].setJump(new Jump(start, end, JumpType.SNAKE));
                snakeCnt--;
            }
        }
        while (ladderCnt > 0) {
            int start = ThreadLocalRandom.current().nextInt(0, size*size);
            int end = ThreadLocalRandom.current().nextInt(0, size*size);
            if (start >= end) continue;
            int r = start/size, c = start % size;
            if (cells[r][c].getJump() == null) {
                cells[r][c].setJump(new Jump(start, end, JumpType.Ladder));
                ladderCnt--;
            }
        }
    }

    public int winningPos() {
        return size*size;
    }

    public int getSize() {
        return size;
    }
}
