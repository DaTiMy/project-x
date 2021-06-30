package main;

public class Zelle {

    private boolean isSpezialFeld;
    private static int temp = 0;
    private int id;

    public Zelle(boolean isSpezialFeld) {
    	setId(temp++);
    	this.isSpezialFeld = isSpezialFeld;

    }

    public boolean isSpezialFeld() {
        return isSpezialFeld;
    }

    public void setSpezialFeld(boolean isSpezialFeld) {
        this.isSpezialFeld = isSpezialFeld;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getTemp() {
        return temp;
    }



}
