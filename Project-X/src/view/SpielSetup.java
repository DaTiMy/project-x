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
import java.awt.Rectangle;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class SpielSetup extends JFrame {
    private final JPanel panel = new JPanel();
    private final JRadioButton radio1 = new JRadioButton("1 Spieler (vs KI)");
    private final JRadioButton radio2 = new JRadioButton("2 Spieler");
    private final JRadioButton radio3 = new JRadioButton("3 Spieler");
    private final JRadioButton radio4 = new JRadioButton("4 Spieler");
    private final JRadioButton radio5 = new JRadioButton("5 Spieler");
    private final JButton confirm = new JButton("Confirm");
    private final JPanel panel_1 = new JPanel();
    private final JTextField player1Name = new JTextField();
    private final JTextField player2Name = new JTextField();
    private final JTextField player3Name = new JTextField();
    private final JTextField player4Name = new JTextField();
    private final JTextField player5Name = new JTextField();
    private final JLabel radio_1 = new JLabel("Spieler 1:");
    private final JLabel radio_2 = new JLabel("Spieler 2:");
    private final JLabel radio_3 = new JLabel("Spieler 3:");
    private final JLabel radio_4 = new JLabel("Spieler 4:");
    private final JLabel radio_5 = new JLabel("Spieler 5:");

    public static ButtonGroup spieleranzahl = new ButtonGroup();

    public SpielSetup() {
    	setSize(400, 300);
        spieleranzahl.add(radio1);
        spieleranzahl.add(radio2);
        spieleranzahl.add(radio3);
        spieleranzahl.add(radio4);
        spieleranzahl.add(radio5);
        radio_1.setLabelFor(radio1);
        radio_2.setLabelFor(radio2);
        radio_3.setLabelFor(radio3);
        radio_4.setLabelFor(radio4);
        radio_5.setLabelFor(radio5);
        player5Name.setEnabled(false);
        player5Name.setColumns(10);
        player4Name.setEnabled(false);
        player4Name.setColumns(10);
        player3Name.setEnabled(false);
        player3Name.setColumns(10);
        player2Name.setEnabled(false);
        player2Name.setColumns(10);
        player1Name.setColumns(10);

        getContentPane().add(panel, BorderLayout.WEST);
        panel.setLayout(new GridLayout(5, 3, 0, 0));
        radio1.setSelected(true);

        panel.add(radio1);

        panel.add(radio2);

        panel.add(radio3);

        panel.add(radio4);

        panel.add(radio5);
        confirm.setFocusable(false);
        confirm.setActionCommand("Confirm");
        confirm.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
				  
				  new Controller();
				  dispose();
				  
				  } 
				} );

        getContentPane().add(confirm, BorderLayout.SOUTH);

        getContentPane().add(panel_1, BorderLayout.CENTER);
        panel_1.setLayout(new GridLayout(5, 2, 0, 25));
        radio_1.setHorizontalAlignment(SwingConstants.TRAILING);
        radio_1.setBounds(new Rectangle(0, 0, 150, 25));

        panel_1.add(radio_1);

        panel_1.add(player1Name);
        radio_2.setHorizontalAlignment(SwingConstants.TRAILING);

        panel_1.add(radio_2);

        panel_1.add(player2Name);
        radio_3.setHorizontalAlignment(SwingConstants.TRAILING);

        panel_1.add(radio_3);

        panel_1.add(player3Name);
        radio_4.setHorizontalAlignment(SwingConstants.TRAILING);

        panel_1.add(radio_4);

        panel_1.add(player4Name);
        radio_5.setHorizontalAlignment(SwingConstants.TRAILING);

        panel_1.add(radio_5);

        panel_1.add(player5Name);
        setVisible(true);
    }
public static int getPlayerNo()
    {
        if (spieleranzahl.getSelection().getActionCommand() != null) {

            try{
                int playerNo = Integer.parseInt(spieleranzahl.getSelection().getActionCommand());
                return playerNo;


            }
            catch (NumberFormatException ex){
                ex.printStackTrace();
            }

        }
        else {
            int playerNo = 5;
            return playerNo;
        }
        return 1;

    }

    public void radioOut() {



    }

}