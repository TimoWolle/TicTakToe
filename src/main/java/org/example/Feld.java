package org.example;

import java.util.Arrays;
import lombok.Getter;
import lombok.Setter;

public class Feld {
    public String[][] spielfeld = new String[3][3];
    //Spalte -> Reihe/Zeile
    public Feld() {
        for (int i = 0; i < spielfeld.length; i++) {
            Arrays.fill(spielfeld[i], "-");
        }
    }

    public void setSpielfeldX(int _spalte, int _reihe, String _XorO) {
        this.spielfeld[_spalte][_reihe] = _XorO;
    }
}
