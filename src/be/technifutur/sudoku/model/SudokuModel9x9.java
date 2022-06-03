package be.technifutur.sudoku.model;

import be.technifutur.sudoku.controler.SudokuModel;

public class SudokuModel9x9 extends AbstractSudoku {
    // char [][] grille = new char[9][9]; dans l'abstract

    //   public static final int EMPTY_VALUE = 0 ; dans l'abstract

    public int getLineSize() {
        return 9;
    }

    public int getColumnSize() {
        return 9;
    }

    public boolean isValidValue(char n)
    {         return n > '0' && n <= (9 +'0');
    };







}

