package LLD_Problems.Tick_Tac_Toe;

import java.util.Deque;
import java.util.Scanner;

public class Game {
    public Deque<Player> players;
    public Board board;

    public Game(Deque<Player> players, int n) {
        this.players = players;
        this.board = new Board(n);
    }

    public void play() {
        int cnt = 0;
        int winner = -1;
        Scanner scan = new Scanner(System.in);
        while (cnt < this.board.size * this.board.size && winner == -1) {
            Player cur = players.pollFirst();
            while (true) {
                System.out.print("coordinates for player::" + cur.id + " => ");
                int row = scan.nextInt(), col = scan.nextInt();
                if (board.makeMove(row, col, cur.piece)) break;
            }
            if (board.hasWinner()) winner = cur.id;
            players.add(cur);
            board.printBoard();
            cnt++;
        }
        if (winner == -1) System.out.println("Its a tie");
        else System.out.println("Winner is player-" + winner);
    }
}
