package be.technifutur.sudoku.model;

public class InvalidValueSudokuException extends SudokuException {
    private char valeur;
    public InvalidValueSudokuException() {

    }

    public InvalidValueSudokuException(char value, String le_message) {
        super(le_message);
        this.valeur = value;
    }


    public char getvalue() {
        return valeur;
    }
}
