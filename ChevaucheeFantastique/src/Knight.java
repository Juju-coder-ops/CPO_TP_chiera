/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author juliette
 */
public class Knight {

    private int row;
    private int col;

    public Knight(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() { return row; }
    public int getCol() { return col; }

    public boolean isValidMove(int newRow, int newCol) {
        int dr = Math.abs(newRow - row);
        int dc = Math.abs(newCol - col);

        return (dr == 2 && dc == 1) || (dr == 1 && dc == 2);
    }

    public void moveTo(int r, int c) {
        row = r;
        col = c;
    }
}

