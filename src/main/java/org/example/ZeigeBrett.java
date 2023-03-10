package org.example;

public class ZeigeBrett extends Feld {

    public static void showBoard(Feld x){
        System.out.println("\n " + x.spielfeld[0][0] + " | " + x.spielfeld[0][1] + " | " + x.spielfeld[0][2] + " ");
        System.out.println("---+---+---");
        System.out.println(" " + x.spielfeld[1][0] + " | " + x.spielfeld[1][1] + " | " + x.spielfeld[1][2] + " ");
        System.out.println("---+---+---");
        System.out.println(" " + x.spielfeld[2][0] + " | " + x.spielfeld[2][1] + " | " + x.spielfeld[2][2] + " ");
    }


}
