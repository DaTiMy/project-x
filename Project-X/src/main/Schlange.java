package projectx;

public class Schlange extends Zelle{

    private boolean isOben;
    private int zielID;

    public Schlange(int zID, boolean oben) {
        super(true);
        zielID = zID;
        setOben(oben);
    }

    public boolean isOben() {
        return isOben;
    }

    public void setOben(boolean isOben) {
        this.isOben = isOben;
    }

    public int getZielID() {
        return zielID;
    }

    public void setZielID(int zielID) {
        this.zielID = zielID;
    }

}