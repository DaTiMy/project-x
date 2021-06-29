package projectx;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class SpielSetup extends JFrame {
	
	JRadioButton spieler1 = new JRadioButton();
	JRadioButton spieler2 = new JRadioButton();
	JRadioButton spieler3 = new JRadioButton();
	JRadioButton spieler4 = new JRadioButton();
	JRadioButton spieler5 = new JRadioButton();
	
	JButton confirm = new JButton("Confirm");
	
	JLabel sp1 = new JLabel("1 Spieler (vs KI)");
	JLabel sp2 = new JLabel("2 Spieler");
	JLabel sp3 = new JLabel("3 Spieler");
	JLabel sp4 = new JLabel("4 Spieler");
	JLabel sp5 = new JLabel("5 Spieler");
	
	JPanel panel = new JPanel();
	JPanel panel2 = new JPanel();
	
	ButtonGroup spieleranzahl = new ButtonGroup();
	
	public SpielSetup() {
		
		spieleranzahl.add(spieler1);
		spieleranzahl.add(spieler2);
		spieleranzahl.add(spieler3);
		spieleranzahl.add(spieler4);
		spieleranzahl.add(spieler5);
		
		panel.setSize(400,400);
		panel.setLayout(new GridLayout(0, 4));
		
		panel.add(spieler1);
		panel.add(sp1);
		panel.add(spieler2);
		panel.add(sp2);
		panel.add(spieler3);
		panel.add(sp3);
		panel.add(spieler4);
		panel.add(sp4);
		panel.add(spieler5);
		panel.add(sp5);
		
		confirm.setBounds(0,0,20,20);
		panel2.setLayout(new FlowLayout());
		panel2.add(panel);
		panel2.add(confirm);
		
		this.setLayout(new BorderLayout());
		
		this.add(panel2);
		this.setSize(400,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.pack();
	}
	
	public static void main(String args[]) {
		
		new SpielSetup();
		
	}
	
}
