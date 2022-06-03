package be.technifutur.sudoku.model;

public class OutOfSudokuException extends SudokuException {
    // variable d'instance utilisé pour stocker les lignes et colonne reçue en paramètre dans la fonction outof(lig,col,string message)
    // Hors de fonction pour ne pas être en locale et utilisable dans toute la classe outofsudokuexception

    private int ligne;
    private int colonne;

    // constructeur
    public OutOfSudokuException() {
        super("le message");
    }

    public OutOfSudokuException(int ligne, int colonne, String le_message) {
        super(le_message);

        this.ligne=ligne;
        this.colonne=colonne;

    }

    public int getLine()
    {
        return ligne;
    }

    public int getColumn()
    {
        return colonne;
    }
}
