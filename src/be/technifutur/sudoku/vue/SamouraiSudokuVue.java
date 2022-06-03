package be.technifutur.sudoku.vue;

import be.technifutur.sudoku.model.SamouraiSudokuModel;

public class SamouraiSudokuVue {
    public String getGrilleVide() {
        return """
                 +-------+-------+-------+       +-------+-------+-------+
                 | . . . | . . . | . . . |       | . . . | . . . | . . . |
                 | . . . | . . . | . . . |       | . . . | . . . | . . . |
                 | . . . | . . . | . . . |       | . . . | . . . | . . . |
                 +-------+-------+-------+       +-------+-------+-------+
                 | . . . | . . . | . . . |       | . . . | . . . | . . . |
                 | . . . | . . . | . . . |       | . . . | . . . | . . . |
                 | . . . | . . . | . . . |       | . . . | . . . | . . . |
                 +-------+-------+-------+-------+-------+-------+-------+
                 | . . . | . . . | . . . | . . . | . . . | . . . | . . . |
                 | . . . | . . . | . . . | . . . | . . . | . . . | . . . |
                 | . . . | . . . | . . . | . . . | . . . | . . . | . . . |
                 +-------+-------+-------+-------+-------+-------+-------+
                                 | . . . | . . . | . . . |
                                 | . . . | . . . | . . . |
                                 | . . . | . . . | . . . |
                 +-------+-------+-------+-------+-------+-------+-------+
                 | . . . | . . . | . . . | . . . | . . . | . . . | . . . |
                 | . . . | . . . | . . . | . . . | . . . | . . . | . . . |
                 | . . . | . . . | . . . | . . . | . . . | . . . | . . . |
                 +-------+-------+-------+-------+-------+-------+-------+
                 | . . . | . . . | . . . |       | . . . | . . . | . . . |
                 | . . . | . . . | . . . |       | . . . | . . . | . . . |
                 | . . . | . . . | . . . |       | . . . | . . . | . . . |
                 +-------+-------+-------+       +-------+-------+-------+
                 | . . . | . . . | . . . |       | . . . | . . . | . . . |
                 | . . . | . . . | . . . |       | . . . | . . . | . . . |
                 | . . . | . . . | . . . |       | . . . | . . . | . . . |
                 +-------+-------+-------+       +-------+-------+-------+
                 """;
    }


    public String getGrille(SamouraiSudokuModel sudo) {
        Character[] tableau = new Character[441];

        String format = getGrilleVide().replace(".", "%s");

        int pos = 0;

        for (int ligne = 0; ligne < sudo.getLineSize(); ligne++) {
            for (int colonne = 0; colonne < sudo.getColumnSize(); colonne++) {
                if (sudo.isValid(ligne, colonne)) {

                    if (sudo.isEmpty(ligne, colonne)) {
                        tableau[pos] = '.';
                    } else {
                        tableau[pos] = sudo.getValue(ligne, colonne);
                    }
                    pos++;
                }

            }
        }
        String solution = String.format(format, (Object[]) tableau);


        return solution;

    }
}

