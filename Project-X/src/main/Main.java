package main;

import java.util.ArrayList;

import controller.Controller;
import view.SpielSetup;


public class Main {

    public static Spieler[] spielerListe;
    static Spielbrett spielbrett = new Spielbrett();
    static ArrayList<Zelle> spielfeld = spielbrett.getSpielfeld();
    static ArrayList<Integer> schlangen = spielbrett.getSchlangen();
    static ArrayList<Integer> leitern = spielbrett.getLeitern();
    static boolean spielBeendet = false;
    static Spieler currPlayer;
    public static int counter =0;
    
	

    public static void main(String[] args) {


    	
    	
    	SpielSetup setup = new SpielSetup();
    	
    	int pNumber = setup.getPlayerNo();
    
    		spielerListe = new Spieler[pNumber];
        	

            for(int i = 0; i < getSpielerListe().length; i++)
            {

            String name = "Tim";
       
            int posi = 0;
            getSpielerListe()[i] = spielerErstellung(posi,name);
            }
           
          
            currPlayer = spielerListe[counter];
            
            

     


    	
    	

      


    }

    
    public static void spielzug(Spieler s) {
  
    	s.setNewSpielerPosition();
        checkFeld(s);

    System.out.println(s.getSpielerName() + " "+ s.getSpielerPosition());
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