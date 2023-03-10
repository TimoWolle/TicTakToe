package org.example;

import lombok.NoArgsConstructor;

@NoArgsConstructor

public class Bot extends Main{

    public int calculateMove(Feld x) {
        int count = 0;

        int tmpspalte = 0;
        int row = 0;

        while (row < 3) {

            //Schaut sich eine Spalte von oben nach unten an
            for (int i = 0; i < 3; i++) {
                if (x.spielfeld[i][row].equals(spieler)) {
                    count++;
                }
                if (x.spielfeld[i][row].equals("-")) tmpspalte = i;

                if (count == 2) {
                    for(int j=0; j<3; j++) {
                        if (x.spielfeld[j][row].equals("-")) {
                            x.spielfeld[j][row] = kibot;
                            return 0;
                        }
                    }
                } else if (count == 3) {
                    System.out.println("Gewonnen");
                    return 1;
                }
            }
            count = 0;
            row++;
        }


        int tmprow = 0;
        int spalte = 0;

        while(spalte <3){
            for (int i = 0; i < 3; i++) {
                if (x.spielfeld[spalte][i].equals(spieler)) {
                    count++;
                }

                if (count == 2) {
                    for(int j=0; j<3; j++) {
                        if (x.spielfeld[spalte][j].equals("-")) {
                            x.spielfeld[spalte][j] = kibot;
                            return 0;
                        }
                    }
                } else if (count == 3) {
                    System.out.println("Gewonnen");
                    return 0;
                }
            }
            count = 0;
            spalte++;
        }

        x.spielfeld[tmpspalte][tmprow] = kibot;
        return 0;
    }
}
