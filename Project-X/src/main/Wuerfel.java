package main;

import view.GUI;

import java.util.Random;

import javax.swing.ImageIcon;

public class Wuerfel {

	Random rnd = new Random();

	public Wuerfel() {



	}

	public int neuerWurf() {

		int x = rnd.nextInt(5)+1;
		System.out.println(x);

		switch(x) {

		case 1: GUI.wuerfel.setIcon(new ImageIcon(GUI.class.getResource("/view/1.png")));
		break;
		case 2: GUI.wuerfel.setIcon(new ImageIcon(GUI.class.getResource("/view/2.png")));
		break;
		case 3: GUI.wuerfel.setIcon(new ImageIcon(GUI.class.getResource("/view/3.png")));
		break;
		case 4: GUI.wuerfel.setIcon(new ImageIcon(GUI.class.getResource("/view/4.png")));
		break;
		case 5: GUI.wuerfel.setIcon(new ImageIcon(GUI.class.getResource("/view/5.png")));
		break;
		case 6: GUI.wuerfel.setIcon(new ImageIcon(GUI.class.getResource("/view/6.png")));
		break;
		default:
			break;

		}
		
		return x;
	}

}

