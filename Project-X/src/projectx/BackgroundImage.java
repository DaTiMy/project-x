package projectx;

import javax.swing.*;

public class BackgroundImage extends JLabel {

	public BackgroundImage() {

		this.setBounds(0, 0, 800, 800);
		ImageIcon img = new ImageIcon("project-x/Project-X/img/bg.jpg");
		this.setIcon(img);

	}

}
