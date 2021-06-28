package projectx;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Spielbrett spielbrett = new Spielbrett();
		ArrayList<Zelle> spielfeld = spielbrett.getSpielfeld();
		ArrayList<Integer> schlangen = spielbrett.getSchlangen();
		ArrayList<Integer> leitern = spielbrett.getLeitern();	

		for(int i = 0; i < 50;i++)
		{
			System.out.println(spielfeld.get(i).getId());
		}

	}
}

