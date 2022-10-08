package LLD_Problems.Snake_And_Ladder;

import java.util.Deque;
import java.util.LinkedList;

public class Game {
    private Board board;
    private Dice dice;
    private Deque<Player> players;
    private int winnerId;

    public Game(int playerCnt) {
        board = new Board(10, 5, 7);
        dice = new Dice(1, 6);
        addPlayers(playerCnt);
        this.winnerId = -1;
    }

    private void addPlayers(int playerCnt) {
        players = new LinkedList<>();
        for (int i = 0; i < playerCnt; i++) players.add(new Player(i, 0));
    }

    private void makeMove() {
        Player cur = players.pollFirst();
        int curPos = cur.getCurPos();
        int move = dice.rollDice();
        if (curPos + move > board.winningPos()) {
            players.add(cur);
            return;
        }
        int finalPos = curPos + move;
        if (finalPos == board.winningPos()) {
            winnerId = cur.getId();
            return;
        }
        int r = finalPos/ board.getSize(), c = finalPos % board.getSize();
        if (board.cells[r][c].getJump() != null) finalPos = board.cells[r][c].getJump().getEnd();
        cur.setCurPos(finalPos);
        players.add(cur);
    }

    public int getWinner() {
        while (winnerId == -1) {
            makeMove();
        }
        return winnerId;
    }
}
