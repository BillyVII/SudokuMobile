package be.technifutur.sudoku.vue;

import be.technifutur.sudoku.model.OutOfSudokuException;
import be.technifutur.sudoku.model.SudokuModel4x4;

public class SudokuVue4x4 {
    public String getGrilleVide() {
        String grille = """
                        +------+-----+
                        | . .  | . . |
                        | . .  | . . |
                        +------+-----+
                        | . .  | . . |
                        | . .  | . . |
                        +------+-----+
                        """;

        return grille;
    }

    public String getGrille(SudokuModel4x4 sudo) throws OutOfSudokuException {
       Character[] tableau = new Character[16];
        String format = getGrilleVide().replace(".","%s");

        int pos = 0;

        for(int ligne =0; ligne < sudo.getLineSize();ligne++){
            for(int colonne=0; colonne < sudo.getColumnSize(); colonne++){
                if(sudo.isEmpty(ligne, colonne)){
                    tableau[pos]='.';
                }
                else {
                    tableau[pos]=sudo.getValue(ligne, colonne);
                }

                pos++;
            }
        }
        String solution = String.format(format,(Object[])tableau);




        return solution;

    }
}
