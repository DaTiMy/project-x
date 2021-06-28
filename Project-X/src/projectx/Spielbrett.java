package projectx;

public class Spielbrett {

	private Zelle[] spielfeld = new Zelle[49];

	public Spielbrett() {

	}

	public Zelle[] getSpielfeld() {
		return spielfeld;
	}

	public void setSpielfeld(Zelle[] spielfeld) {
		this.spielfeld = spielfeld;
		for(int i = 0; i <= 50; i++)
		{
			spielfeld[i] = new Zelle(false);
			switch(i)
			{
				case 6:
					spielfeld[i] = new Leiter(14,true);
					break;
				case 16:
					spielfeld[i] = new Schlange(3,true);
					break;
				case 17:
					spielfeld[i] = new Leiter(23,true);
					break;
				case 27:
					spielfeld[i] = new Leiter(33,true);
					break;
				case 29:
					spielfeld[i] = new Schlange(10,true);
					break;
				case 38:
					spielfeld[i] = new Leiter(43, true);
					break;
				case 39:
					spielfeld[i] = new Schlange(20, true);
					break;
				case 45:
					spielfeld[i] = new Schlange(34,true);
					break;
			}
		}
	}


}
