package main;

import java.util.ArrayList;
import java.util.Scanner;

import view.GUI;


public class Main {

    static Spieler[] spielerListe;
    static Spielbrett spielbrett = new Spielbrett();
    static ArrayList<Zelle> spielfeld = spielbrett.getSpielfeld();
    static ArrayList<Integer> schlangen = spielbrett.getSchlangen();
    static ArrayList<Integer> leitern = spielbrett.getLeitern();
    static boolean spielBeendet = false;
    static Spieler currPlayer;

    public static void main(String[] args) {

        int anzahl = 1;
        spielerListe = new Spieler[anzahl];
        new GUI();

        for(int i = 0; i < spielerListe.length; i++)
        {

        String name = "Tim";
        
        int posi = 0;
        spielerListe[i] = spielerErstellung(posi,name);
        }
        boolean game = true;
        while(game)
        {

            for(int i = 0; i < spielerListe.length; i++)
            {
                currPlayer = spielerListe[i];
                    spielzug(i);
            }


        }


    }

    
    public static void spielzug(int i) {
    	spielerListe[i].setNewSpielerPosition();
        checkFeld(spielerListe[i]);

    System.out.println(spielerListe[i].getSpielerName() + " "+ spielerListe[i].getSpielerPosition());
    }
    public static Spieler spielerErstellung(int pos,String spielerName)
    {
        return new Spieler(pos, spielerName);
    }
    public static void checkFeld(Spieler spieler)
    {

        boolean check = spielfeld.get(spieler.getSpielerPosition()).isSpezialFeld();

        if(check)
        {

            if(schlangen.contains(spieler.getSpielerPosition()))
            {
                 Schlange feld = (Schlange)spielfeld.get(spieler.getSpielerPosition());
                 if(feld.isOben())
                 {
                     spieler.setSpielerPosition(feld.getZielID());
                 }

            }
            else if(leitern.contains(spieler.getSpielerPosition()))
            {
                 Leiter feld = (Leiter)spielfeld.get(spieler.getSpielerPosition());
                 if(feld.isUnten())
                 {
                     spieler.setSpielerPosition(feld.getZielID());
                 }


            }
        }

    }

    public static Spieler getCurr() {

        return currPlayer;
    }


}