package be.technifutur.sudoku.model;

public class SudokuException extends Exception {
    public SudokuException(String le_message) {
        super(le_message);
    }

    public SudokuException() {

    }

    public void OutOfSudokuException (int ligne, int colonne, String le_message) {

    }

}
