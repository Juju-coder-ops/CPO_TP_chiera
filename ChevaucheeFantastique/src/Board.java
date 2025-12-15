/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author juliette
 */
public class Board {

    private int rows;
    private int cols;
    private boolean[][] cells;

    public Board(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        cells = new boolean[rows][cols];

        // Exemple : toutes les cases sont allumées
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                cells[i][j] = true;
            }
        }
    }

    public boolean isLit(int r, int c) {
        return cells[r][c];
    }

    public void turnOff(int r, int c) {
        cells[r][c] = false;
    }

    public boolean allOff() {
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                if (cells[i][j])
                    return false;
        return true;
    }

    public int getRows() { return rows; }
    public int getCols() { return cols; }
}
