package be.technifutur.sudoku.controler;

import be.technifutur.sudoku.model.InvalidValueSudokuException;
import be.technifutur.sudoku.model.OutOfSudokuException;
import be.technifutur.sudoku.model.SudokuModel9x9;

public class SudokuInitControler {
    private SudokuModel model;
    public void setSudoku( SudokuModel model) {
        this.model = model;
        // tu dois utiliser le modele fournit
        // dire que le sudoku utilisé c'est l'objet envoyé
    }

    public void request(String s) throws OutOfSudokuException, InvalidValueSudokuException {
// fonction split pour séparer les caractères int des caractères char en utisant un tableau string
        String []tab = s.split("\\.");
// Integer.parseInt pour transformer le string en integer

        int val1=Integer.parseInt(tab[0]);
        int val2=Integer.parseInt(tab[1]);
        char val3= tab[2].charAt(0);
        model.setValue(val1-1, val2-1,val3);
    }


    public SudokuModel getSudoku() {
        return model ;
    }

 
}
