package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

import controller.Controller;

public class GUI extends JFrame{

    JLayeredPane layeredPane;
    JLabel BG;
    JLabel Rangliste;
    JLabel lblNewLabel;
    JLabel lblNewLabel_1;
    JLabel lblNewLabel_2;
    JLabel lblNewLabel_3;
    JLabel lblNewLabel_4;
    public static JLabel player;
    
    public static JLabel wuerfel;

    public GUI() {
        setSize(750, 750);
        setTitle("Snakes & Ladders");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        layeredPane = new JLayeredPane();
        getContentPane().add(layeredPane, BorderLayout.CENTER);
        layeredPane.setLayout(null);

        BG = new JLabel("");
        BG.setBounds(0, 0, 736, 713);
        layeredPane.setLayer(BG, 1);
        BG.setIcon(new ImageIcon(GUI.class.getResource("/view/bg.png")));
        layeredPane.add(BG);

        Rangliste = new JLabel("Rangliste");
        Rangliste.setFont(new Font("Tahoma", Font.BOLD, 36));
        Rangliste.setPreferredSize(new Dimension(45, 22));
        Rangliste.setBounds(40, 500, 250, 40);
        layeredPane.setLayer(Rangliste, 2);
        layeredPane.add(Rangliste);

        lblNewLabel = new JLabel("1.\r\n");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
        layeredPane.setLayer(lblNewLabel, 2);
        lblNewLabel.setBounds(40, 550, 250, 25);
        layeredPane.add(lblNewLabel);

        lblNewLabel_1 = new JLabel("2.\r\n");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 24));
        layeredPane.setLayer(lblNewLabel_1, 2);
        lblNewLabel_1.setBounds(40, 575, 250, 25);
        layeredPane.add(lblNewLabel_1);

        lblNewLabel_2 = new JLabel("3.\r\n");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 24));
        layeredPane.setLayer(lblNewLabel_2, 2);
        lblNewLabel_2.setBounds(40, 600, 250, 25);
        layeredPane.add(lblNewLabel_2);

        lblNewLabel_3 = new JLabel("4.\r\n");
        lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 24));
        layeredPane.setLayer(lblNewLabel_3, 2);
        lblNewLabel_3.setBounds(40, 625, 250, 25);
        layeredPane.add(lblNewLabel_3);

        lblNewLabel_4 = new JLabel("5.");
        lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 24));
        layeredPane.setLayer(lblNewLabel_4, 2);
        lblNewLabel_4.setBounds(40, 650, 250, 25);
        layeredPane.add(lblNewLabel_4);

        wuerfel = new JLabel("");

        wuerfel.setIcon(new ImageIcon(GUI.class.getResource("/view/6.png")));
        layeredPane.setLayer(wuerfel, 2);
        wuerfel.setBounds(440, 500, 200, 200);
        layeredPane.add(wuerfel);
        
        
        player = new JLabel();

        player.setIcon(new ImageIcon(GUI.class.getResource("/view/player_red.png")));
        layeredPane.setLayer(player, 2);
        layeredPane.add(player,2);
      

    }

    public void addMyListener(Controller controller) {
        wuerfel.addMouseListener(controller);
    }

}