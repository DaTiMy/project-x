package main;

import view.GUI;

import java.util.Random;

import javax.swing.ImageIcon;

public class Wuerfel {

	Random rnd = new Random();

	public Wuerfel() {

		GUI.wuerfel.setIcon(new ImageIcon(GUI.class.getResource("/view/6.png")));

	}

	public void wuerfeln() {

		for(int i = 0; i < rnd.nextInt(5)+1; i++) {

			int x = rnd.nextInt(5)+1;

			switch(x) {

			case 1: 



			}	
		}
	}
}

