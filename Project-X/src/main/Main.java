package main;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    static Spieler[] spielerListe;
    static Spielbrett spielbrett = new Spielbrett();
    static ArrayList<Zelle> spielfeld = spielbrett.getSpielfeld();
    static ArrayList<Integer> schlangen = spielbrett.getSchlangen();
    static ArrayList<Integer> leitern = spielbrett.getLeitern();
    static boolean spielBeendet = false;
    static Spieler currPlayer;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int anzahl = sc.nextInt();
        spielerListe = new Spieler[anzahl];


        for(int i = 0; i < spielerListe.length; i++)
        {

        System.out.println("Name:");
        String name = sc.next();

        int posi = 0;
        spielerListe[i] = spielerErstellung(posi,name);
        }
        boolean game = true;
        int eingabe = 0;
        while(game)
        {

            for(int i = 0; i < spielerListe.length; i++)
            {
                currPlayer = spielerListe[i];
                eingabe = sc.nextInt();
                if(eingabe == 1)
                {
                    spielerListe[i].setNewSpielerPosition();
                    checkFeld(spielerListe[i]);
                }

                System.out.println(spielerListe[i].getSpielerName() + " "+ spielerListe[i].getSpielerPosition());
            }


        }






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