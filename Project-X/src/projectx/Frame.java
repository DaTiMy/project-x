package projectx;

import javax.swing.*;

public class Frame extends JFrame {

	public Frame() {
		
		this.setBounds(0, 0, 800, 800);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(new BackgroundImage());
		this.pack();
	}
}
