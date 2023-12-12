package LLD_Problems.Tick_Tac_Toe;

import LLD_Problems.Tick_Tac_Toe.Pieces.Piece;

public class Player {
    public int id;
    public Piece piece;

    public Player(int id, Piece piece) {
        this.id = id;
        this.piece = piece;
    }
}
