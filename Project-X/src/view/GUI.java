package projectx;

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
		this.setAlwaysOnTop(true);
		
	}
	
	public static void main(String args[]) {
		
		new GUI();
		
	}
	
}
