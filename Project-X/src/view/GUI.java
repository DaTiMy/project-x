package view;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;

public class GUI extends JFrame{

	public GUI() {
		
		JLayeredPane layeredPane = new JLayeredPane();
		getContentPane().add(layeredPane, BorderLayout.NORTH);
		layeredPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("");
		layeredPane.setLayer(lblNewLabel, 1);
		lblNewLabel.setIcon(new ImageIcon(GUI.class.getResource("/view/bg.png")));
		layeredPane.add(lblNewLabel, BorderLayout.CENTER);

	}
}
