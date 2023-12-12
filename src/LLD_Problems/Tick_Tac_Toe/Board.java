package LLD_Problems.Tick_Tac_Toe;

import LLD_Problems.Tick_Tac_Toe.Pieces.Piece;

public class Board {
    public int size;
    public Piece[][] grid;

    public Board(int size) {
        this.size = size;
        grid = new Piece[size][size];
    }

    public boolean makeMove(int i, int j, Piece piece) {
        if (grid[i][j] != null && grid[i][j].pieceType == piece.pieceType) return false;
        grid[i][j] = piece;
        return true;
    }

    public boolean hasWinner() {
        for (int i = 0; i < size; i++) {
            boolean hasWinner = true;
            for (int j = 0; j < size && hasWinner; j++) {
                hasWinner = grid[i][j] != null && grid[i][0] != null
                            && grid[i][j].pieceType == grid[i][0].pieceType;
            }
            if (hasWinner) return true;
        }

        for (int j = 0; j < size; j++) {
            boolean hasWinner = true;
            for (int i = 0; i < size && hasWinner; i++) {
                hasWinner = grid[i][j] != null && grid[0][j] != null
                            && grid[i][j].pieceType == grid[0][j].pieceType;
            }
            if (hasWinner) return true;
        }

        boolean hasWinner = true;
        for (int i = 0; i < size && hasWinner; i++)
            hasWinner = grid[i][i] != null && grid[0][0] != null
                        && grid[i][i].pieceType == grid[0][0].pieceType;
        if (hasWinner) return true;

        hasWinner = true;
        for (int i = 0; i < size && hasWinner; i++)
            hasWinner = grid[i][size-i-1] != null && grid[0][size-1] != null
                        && grid[i][size-i-1].pieceType == grid[0][size-1].pieceType;
        return hasWinner;
    }


    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (grid[i][j] == null) System.out.print(" |");
                else System.out.print(grid[i][j].pieceType + "|");
            }
            System.out.println();
        }
    }
}
