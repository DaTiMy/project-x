package main;

import view.GUI;

import java.util.Random;

import javax.swing.ImageIcon;

public class Wuerfel {

    Random rnd = new Random();
    int x;

    public Wuerfel() {

        GUI.wuerfel.setIcon(new ImageIcon(GUI.class.getResource("/view/6.png")));

    }

    public void neuerWurf() {

        this.x = rnd.nextInt(5)+1;

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
        }
    }
    
    public int wGetX() {
    	return this.x;
    }

}