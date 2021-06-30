package main;

import java.util.Random;

public class Spieler {
	private int spielerPosition;
	private String spielerName;

	public Spieler(int spielerPosition, String spielerName) {
		setSpielerPosition(spielerPosition);
		setSpielerName(spielerName);
	}

	public int getSpielerPosition() {
		return spielerPosition;
	}

	public void setSpielerPosition(int spielerPosition) {
		this.spielerPosition = spielerPosition;
	}

	public String getSpielerName() {
		return spielerName;
	}

	public void setSpielerName(String spielerName) {
		this.spielerName = spielerName;
	}

	public int wuerfeln()
	{
		Random rn = new Random();

		return rn.nextInt(5)+1;
	}

	public void setNewSpielerPosition()
	{
		int wurf =  wuerfeln();
		if(this.spielerPosition + wurf >= 50) {

			Main.spielBeendet = true;
			System.out.println("Spiel beendet");
			return;
		}
		this.spielerPosition = this.spielerPosition + wurf;

	}

}
