package projectx;

import javax.swing.JFrame;

public class GUI extends JFrame{

	public GUI() {
		
		BackgroundImage img = new BackgroundImage();
		
		this.add(img.panel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
		this.setSize(1000, 1000);
		
	}
	
	public static void main(String args[]) {
		
		new GUI();
		
	}
	
}
