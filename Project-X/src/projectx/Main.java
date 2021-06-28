package projectx;

public class Main {

	public static void main(String[] args) {
	Spielbrett spielbrett = new Spielbrett();
	
	spielbrett.setSpielfeld();
	for(int i = 0; i<= 49;i++)
	{
		System.out.println(spielbrett.getSpielfeld()[i].getId());
	}

	}

}
