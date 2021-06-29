package view;

import javax.swing.JFrame;

public class GUI extends JFrame{

	public GUI() {
		
		BackgroundImage img = new BackgroundImage();
		
		this.add(img.background);
		this.setTitle("Snakes and Ladders");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(getPreferredSize());
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setResizable(false);
		
	}
	
}
