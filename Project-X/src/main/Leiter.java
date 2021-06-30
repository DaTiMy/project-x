package main;

public class Leiter extends Zelle{

    private boolean isUnten;
    private int zielID;

    public Leiter(int zID, boolean unten) {
        super(true);
        zielID = zID;
        setUnten(unten);
    }

    public boolean isUnten() {
        return isUnten;
    }

    public void setUnten(boolean isOben) {
        this.isUnten = isOben;
    }

    public int getZielID() {
        return zielID;
    }

    public void setZielID(int zielID) {
        this.zielID = zielID;
    }

}