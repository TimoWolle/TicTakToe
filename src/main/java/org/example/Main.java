package org.example;

import java.util.Scanner;

import static org.example.ZeigeBrett.showBoard;


public class Main {
    public static void main(String[] args) {
        Feld brett = new Feld();
        Bot ki = new Bot();

        showBoard(brett);

        Scanner input = new Scanner(System.in);
        int spalte = 0;
        int zeile = 0;

        System.out.println("Wollen sie mit 'X' oder 'O' spielen?");
        spieler = input.nextLine().toUpperCase();

        if(spieler.equals("X")){
            kibot = "O";
        } else if (spieler.equals("O")) {
            kibot = "X";
        }else{
            spieler = "X";
            kibot="O";
        }

        while(!input.equals("exit")){
            System.out.println("\nErst Spalte dann Zeile, Format:'[1-3],[1-3]'");
            String tmp = input.nextLine();
            String[] zahl = tmp.split(",");

            spalte = Integer.parseInt(zahl[0])-1;
            zeile = Integer.parseInt(zahl[1])-1;

            if(0 > spalte || spalte > 3 || 0 > zeile || zeile > 3 || !brett.spielfeld[spalte][zeile].equals("-")){
                System.out.println("\nFehler bei der Eingabe., bitte erneut probieren.");
                continue;
            }

            brett.setSpielfeldX(spalte, zeile, spieler);
            showBoard(brett);

            if(ki.calculateMove(brett)==0){
                showBoard(brett);
            }else{
                System.out.println("GEWONNEN");
                return;
            }
        }
    }

    public static String spieler = "";
    public static String kibot = "";
}