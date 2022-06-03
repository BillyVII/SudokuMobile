package be.technifutur.sudoku.model;

import be.technifutur.sudoku.controler.SudokuModel;

public class SamouraiSudokuModel implements SudokuModel {
    char [][] grille = new char[21][21];
    public static final char EMPTY_VALUE = 0;

    public int getLineSize() {
        return 21;
    }

    public int getColumnSize() {
        return 21;
    }

    public boolean isEmpty(int ligne, int colonne) {
        boolean vide;
        if (grille[ligne][colonne]== EMPTY_VALUE){
            vide = true;
        }
        else {
            vide = false;
        }
        return vide;
    }

    public void setValue(int ligne, int colonne, char valeur) {
        grille[ligne][colonne]=valeur;
    }


    public char getValue(int ligne, int colonne) {
        char valeur;
        valeur = grille[ligne][colonne];

        return valeur;
    }
    public boolean isValid(int ligne, int colonne){
        boolean isValid=true;

        if (ligne>=0 && ligne<=5 && colonne>=9 && colonne<=11){
            isValid = false;
        }
        if (ligne>=9 && ligne<=11 && colonne>=0 && colonne<=5){
            isValid = false;
        }
        if (ligne>=15 && ligne<=20 && colonne>=9 && colonne<=11)
            isValid = false;
        if(ligne>=9 && ligne<=11 && colonne>=15 && colonne<=20){
            isValid = false;
        }

        return isValid;
    }
}
