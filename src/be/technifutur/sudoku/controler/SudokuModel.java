package be.technifutur.sudoku.controler;

import be.technifutur.sudoku.model.InvalidValueSudokuException;
import be.technifutur.sudoku.model.OutOfSudokuException;
import be.technifutur.sudoku.model.SudokuModel9x9;

public interface SudokuModel  {

    void setValue(int ligne, int colonne, char valeur) throws OutOfSudokuException, InvalidValueSudokuException;
    char getValue(int ligne, int colonne) throws OutOfSudokuException;
    public static final char EMPTY_VALUE = 0;



}
