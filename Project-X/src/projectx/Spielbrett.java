package projectx;

public class Spielbrett {

	private Zelle[] spielfeld = new Zelle[49];

	public Spielbrett() {

	}

	public Zelle[] getSpielfeld() {
		return spielfeld;
	}

	public void setSpielfeld() {
		
		for(int i = 0; i <= 50; i++)
		{
			this.spielfeld[i] = new Zelle(false);
			switch(i)
			{
				case 6:
					this.spielfeld[i] = new Leiter(14,true);
					break;
				case 16:
					this.spielfeld[i] = new Schlange(3,true);
					break;
				case 17:
					this.spielfeld[i] = new Leiter(23,true);
					break;
				case 27:
					this.spielfeld[i] = new Leiter(33,true);
					break;
				case 29:
					this.spielfeld[i] = new Schlange(10,true);
					break;
				case 38:
					this.spielfeld[i] = new Leiter(43, true);
					break;
				case 39:
					this.spielfeld[i] = new Schlange(20, true);
					break;
				case 45:
					this.spielfeld[i] = new Schlange(34,true);
					break;
			}
		}
	}


}
