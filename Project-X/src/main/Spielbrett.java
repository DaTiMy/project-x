package main;

import java.util.ArrayList;

public class Spielbrett {

    private ArrayList<Zelle> spielfeld;
    private ArrayList<Integer> schlangen;
    private ArrayList<Integer> leitern;

    public Spielbrett() {

        spielfeld = new ArrayList<Zelle>();
        schlangen = new ArrayList<Integer>();
        leitern = new ArrayList<Integer>();
        spielbrettFuellen();
    }

    public ArrayList<Zelle> getSpielfeld() {
        return spielfeld;
    }

    public ArrayList<Integer> getSchlangen() {
        return schlangen;
    }

    public ArrayList<Integer> getLeitern() {
        return leitern;
    }

    public void spielbrettFuellen() {
        for(int i = 0; i <= 50; i++)
        {
            switch(i)
            {
                case 6:
                    this.spielfeld.add(new Leiter(14,true));
                    this.leitern.add(this.spielfeld.get(i).getId());
                    break;
                case 16:
                    this.spielfeld.add(new Schlange(4,true));
                    this.schlangen.add(this.spielfeld.get(i).getId());
                    break;
                case 17:
                	this.spielfeld.add(new Leiter(23,true));
                    this.leitern.add(this.spielfeld.get(i).getId());
                    break;
                case 27:
                    this.spielfeld.add(new Leiter(33,true));
                    this.leitern.add(this.spielfeld.get(i).getId());
                    break;
                case 29:
                    this.spielfeld.add(new Schlange(10,true));
                    this.schlangen.add(this.spielfeld.get(i).getId());
                    break;
                case 38:
                    this.spielfeld.add(new Leiter(43, true));
                    this.leitern.add(this.spielfeld.get(i).getId());
                    break;
                case 39:
                    this.spielfeld.add(new Schlange(20, true));
                    this.schlangen.add(this.spielfeld.get(i).getId());
                    break;
                case 45:
                    this.spielfeld.add(new Schlange(34,true));
                    this.schlangen.add(this.spielfeld.get(i).getId());
                    break;
                default:
                    this.spielfeld.add(new Zelle(false));
                    break;
            }
        }
    }


}