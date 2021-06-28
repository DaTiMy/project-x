package projectx;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Spielbrett spielbrett = new Spielbrett();
		spielbrett.setSpielfeld();
		
		ArrayList<Zelle> spf = spielbrett.getSpielfeld();

		for(int i = 0; i<= 49;i++)
		{
			System.out.println(spf.get(i).getId());

		}
		if()
	}
}

