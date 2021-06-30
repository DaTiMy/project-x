package controller;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import main.Wuerfel;
import main.Main;
import main.Spieler;
import view.GUI;

public class Controller implements MouseListener{

	private GUI view;

    public Controller() {
        view = new GUI();
        view.addMyListener(this);
    }

    public void actionPerformed(ActionEvent e) {


    }

    @Override
    public void mouseClicked(MouseEvent e) {
        new Wuerfel().neuerWurf();
        Spieler temp = Main.getCurr();
        int q = temp.getSpielerPosition();
        int[] bounds = move(q);
        GUI.player.setBounds(bounds[0], bounds[1],20,20);

    }

    @Override
    public void mousePressed(MouseEvent e) {


    }

    @Override
    public void mouseReleased(MouseEvent e) {


    }

    @Override
    public void mouseEntered(MouseEvent e) {


    }

    @Override
    public void mouseExited(MouseEvent e) {


    }
	public int[] move(int id)
	{
		int x = 0;
		int y = 0;
		int[] xcoords = {110, 170, 230, 280, 340, 390, 510, 560, 600, 620, 560, 500, 440, 390, 220, 170, 110, 160, 210, 270, 320, 380, 430, 540, 650, 620, 560, 510, 440, 390, 335, 280, 130, 125, 170, 230, 290, 400, 460, 520, 580, 620};
		int[] ycoords = {390, 390, 390, 400, 400, 400, 400, 400, 380, 300, 300, 300, 300, 300, 300, 300, 230, 210, 210, 210, 210, 210, 210, 220, 160, 140, 130, 130, 125, 125, 130, 130, 125, 50, 40, 40, 40, 40, 40, 40, 40, 40};
		
		switch(id) 
		{
		case 0:
			x = xcoords[0];
			y = ycoords[0];
			break;
		case 1:
			x = xcoords[1];
			y = ycoords[1];
			break;
		case 2:
			x = xcoords[2];
			y = ycoords[2];
			break;
		case 3:
			x = xcoords[3];
			y = ycoords[3];
			break;
		case 4:
			x = xcoords[4];
			y = ycoords[4];
			break;
		case 5:
			x = xcoords[5];
			y = ycoords[5];
			break;
		case 6:
			x = xcoords[6];
			y = ycoords[6];
			break;
		case 7:
			x = xcoords[7];
			y = ycoords[7];
			break;
		case 8:
			x = xcoords[8];
			y = ycoords[8];
			break;
		case 9:
			x = xcoords[9];
			y = ycoords[9];
			break;
		case 10:
			x = xcoords[10];
			y = ycoords[10];
			break;
		case 11:
			x = xcoords[11];
			y = ycoords[11];
			break;
		case 12:
			x = xcoords[12];
			y = ycoords[12];
			break;
		case 13:
			x = xcoords[13];
			y = ycoords[13];
			break;
		case 14:
			x = xcoords[14];
			y = ycoords[14];
			break;
		case 15:
			x = xcoords[15];
			y = ycoords[15];
			break;
		case 16:
			x = xcoords[16];
			y = ycoords[16];
			break;
		case 17:
			x = xcoords[17];
			y = ycoords[17];
			break;
		case 18:
			x = xcoords[18];
			y = ycoords[18];
			break;
		case 19:
			x = xcoords[19];
			y = ycoords[19];
			break;
		case 20:
			x = xcoords[20];
			y = ycoords[20];
			break;
		case 21:
			x = xcoords[21];
			y = ycoords[21];
			break;
		case 22:
			x = xcoords[22];
			y = ycoords[22];
			break;
		case 23:
			x = xcoords[23];
			y = ycoords[23];
			break;
		case 24:
			x = xcoords[24];
			y = ycoords[24];
			break;
		case 25:
			x = xcoords[25];
			y = ycoords[25];
			break;
		case 26:
			x = xcoords[26];
			y = ycoords[26];
			break;
		case 27:
			x = xcoords[27];
			y = ycoords[27];
			break;
		case 28:
			x = xcoords[28];
			y = ycoords[28];
			break;
		case 29:
			x = xcoords[29];
			y = ycoords[29];
			break;
		case 30:
			x = xcoords[30];
			y = ycoords[30];
			break;
		case 31:
			x = xcoords[31];
			y = ycoords[31];
			break;
		case 32:
			x = xcoords[32];
			y = ycoords[32];
			break;
		case 33:
			x = xcoords[33];
			y = ycoords[33];
			break;
		case 34:
			x = xcoords[34];
			y = ycoords[34];
			break;
		case 35:
			x = xcoords[35];
			y = ycoords[35];
			break;
		case 36:
			x = xcoords[36];
			y = ycoords[36];
			break;
		case 37:
			x = xcoords[37];
			y = ycoords[37];
			break;
		case 38:
			x = xcoords[38];
			y = ycoords[38];
			break;
		case 39:
			x = xcoords[39];
			y = ycoords[39];
			break;
		case 40:
			x = xcoords[40];
			y = ycoords[40];
			break;
		case 41:
			x = xcoords[41];
			y = ycoords[41];
			break;
		case 42:
			x = xcoords[42];
			y = ycoords[42];
			break;
		case 43:
			x = xcoords[43];
			y = ycoords[43];
			break;
		case 44:
			x = xcoords[44];
			y = ycoords[44];
			break;
		case 45:
			x = xcoords[45];
			y = ycoords[45];
			break;
		case 46:
			x = xcoords[46];
			y = ycoords[46];
			break;
		case 47:
			x = xcoords[47];
			y = ycoords[47];
			break;
		case 48:
			x = xcoords[48];
			y = ycoords[48];
			break;
		case 49:
			x = xcoords[49];
			y = ycoords[49];
			break;
			
		}
		int[] coords = {x,y};
		return coords;
	}
}
