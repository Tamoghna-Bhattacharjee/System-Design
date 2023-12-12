package LLD_Problems.Tick_Tac_Toe;

import LLD_Problems.Tick_Tac_Toe.Pieces.PieceO;
import LLD_Problems.Tick_Tac_Toe.Pieces.PieceX;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Deque<Player> players = new ArrayDeque<>();
        players.add(new Player(1, new PieceO()));
        players.add(new Player(2, new PieceX()));

        Game game = new Game(players, 3);
        game.play();
    }
}
