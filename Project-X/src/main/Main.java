package main;

import java.util.ArrayList;

import controller.Controller;


public class Main {

    static Spieler[] spielerListe;
    static Spielbrett spielbrett = new Spielbrett();
    static ArrayList<Zelle> spielfeld = spielbrett.getSpielfeld();
    static ArrayList<Integer> schlangen = spielbrett.getSchlangen();
    static ArrayList<Integer> leitern = spielbrett.getLeitern();
    static boolean spielBeendet = false;
    static Spieler currPlayer;
    
    public Main(int spielerAnzahl){
    	spielerListe = new Spieler[spielerAnzahl];
    	   new Controller();
    }

    public static void main(String[] args) {

        int anzahl = getSpielerListe().length;

        for(int i = 0; i < getSpielerListe().length; i++)
        {

        String name = "Tim";
        
        int posi = 0;
        getSpielerListe()[i] = spielerErstellung(posi,name);
        }
        boolean game = true;
       while(game)
       {


          for(int i = 0; i < spielerListe.length; i++)
         {
               currPlayer = spielerListe[i];
         
          }
  for(int i = 0; i < getSpielerListe().length; i++)
            {
                currPlayer = getSpielerListe()[i];
                    spielzug(i);
            }



      }


    }

    
    public static void spielzug(int i) {
    	getSpielerListe()[i].setNewSpielerPosition();
        checkFeld(getSpielerListe()[i]);

    System.out.println(getSpielerListe()[i].getSpielerName() + " "+ getSpielerListe()[i].getSpielerPosition());
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


	public static Spieler[] getSpielerListe() {
		return spielerListe;
	}


}