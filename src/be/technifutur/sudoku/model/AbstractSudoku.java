package be.technifutur.sudoku.model;

import be.technifutur.sudoku.controler.SudokuModel;

public abstract class AbstractSudoku implements SudokuModel {


public final char [][] grille = new char [getLineSize()][getColumnSize()];

public abstract  int getLineSize() ;
public abstract int getColumnSize();
protected boolean isValidValue(char n) {         return n > '0' && n <= (4 +'0');
};


public final boolean isEmpty(int ligne, int colonne) {
        boolean vide;
        if (grille[ligne][colonne]== EMPTY_VALUE){
            vide = true;
        }
        else {
            vide = false;
        }
        return vide;

    }

    public final void setValue(int ligne, int colonne, char valeur) throws OutOfSudokuException, InvalidValueSudokuException{
        if (!(positionValid(ligne,colonne)))
        {
            // si colonne et ligne pas bonne exception
            throw new OutOfSudokuException(ligne,colonne,"non non non");
        }
        if(!(isValidValue(valeur))){
            throw new InvalidValueSudokuException();
        }
        grille[ligne][colonne]=valeur;
    }

    private boolean positionValid(int ligne, int colonne) {
    boolean valid=true;
        if (ligne<getLineSize() && ligne>=0 && colonne<getColumnSize() && colonne>=0) {
            valid=true;
        }
        else{
            valid=false;
        }



    return valid;
    }

    public final char getValue(int ligne, int colonne) {
        char valeur;
        valeur = grille[ligne][colonne];

        return valeur;
    }



}
