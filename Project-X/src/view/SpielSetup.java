package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import controller.Controller;
import main.Main;


public class SpielSetup extends JFrame {
	
	JRadioButton spieler1 = new JRadioButton("1");
	JRadioButton spieler2 = new JRadioButton("2");
	JRadioButton spieler3 = new JRadioButton("3");
	JRadioButton spieler4 = new JRadioButton("4");
	JRadioButton spieler5 = new JRadioButton("5");
	
	JButton confirm = new JButton("Confirm");
	
	JLabel sp1 = new JLabel("1 Spieler (vs KI)");
	JLabel sp2 = new JLabel("2 Spieler");
	JLabel sp3 = new JLabel("3 Spieler");
	JLabel sp4 = new JLabel("4 Spieler");
	JLabel sp5 = new JLabel("5 Spieler");
	
	JPanel panel = new JPanel();
	JPanel panel2 = new JPanel();
	
	static ButtonGroup spieleranzahl = new ButtonGroup();
	
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
		confirm.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
				  new Controller();
				  dispose();
				  
				  } 
				} );
		panel2.setLayout(new FlowLayout());
		panel2.add(panel);
		panel2.add(confirm);
		
		getContentPane().setLayout(new BorderLayout());
		
		getContentPane().add(panel2);
		this.setSize(397,325);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.pack();
	}
	
	public static void main(String args[]) {
		
		new SpielSetup();
		
	}
	
	public static int getPlayerNo()
	{
		
		return 5;
		
	}
	
}
