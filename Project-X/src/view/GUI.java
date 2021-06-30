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
	public static JLabel rank1;
	public static JLabel rank2;
	public static JLabel rank3;
	public static JLabel rank4;
	public static JLabel rank5;
	public static JLabel wuerfel;
	public static JLabel player;
	public static JLabel player1 = new JLabel();
	public static JLabel player2 = new JLabel();
	public static JLabel player3 = new JLabel();
	public static JLabel player4 = new JLabel();
	public static JLabel player5 = new JLabel();

	public GUI() {
		setSize(750, 750);
		setTitle("Snakes & Ladders");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);

		layeredPane = new JLayeredPane();
		getContentPane().add(layeredPane, BorderLayout.CENTER);
		layeredPane.setLayout(null);

		BG = new JLabel("");
		BG.setBounds(0, 10, 736, 713);
		layeredPane.setLayer(BG, 1);
		BG.setIcon(new ImageIcon(GUI.class.getResource("/view/bg.png")));
		layeredPane.add(BG);

		Rangliste = new JLabel("Rangliste");
		Rangliste.setFont(new Font("Tahoma", Font.BOLD, 36));
		Rangliste.setPreferredSize(new Dimension(45, 22));
		Rangliste.setBounds(40, 500, 250, 40);
		layeredPane.setLayer(Rangliste, 2);
		layeredPane.add(Rangliste);

		rank1 = new JLabel("1.\r\n");
		rank1.setFont(new Font("Tahoma", Font.BOLD, 24));
		layeredPane.setLayer(rank1, 2);
		rank1.setBounds(40, 550, 250, 25);
		layeredPane.add(rank1);

		rank2 = new JLabel("2.\r\n");
		rank2.setFont(new Font("Tahoma", Font.BOLD, 24));
		layeredPane.setLayer(rank2, 2);
		rank2.setBounds(40, 575, 250, 25);
		layeredPane.add(rank2);

		rank3 = new JLabel("3.\r\n");
		rank3.setFont(new Font("Tahoma", Font.BOLD, 24));
		layeredPane.setLayer(rank3, 2);
		rank3.setBounds(40, 600, 250, 25);
		layeredPane.add(rank3);

		rank4 = new JLabel("4.\r\n");
		rank4.setFont(new Font("Tahoma", Font.BOLD, 24));
		layeredPane.setLayer(rank4, 2);
		rank4.setBounds(40, 625, 250, 25);
		layeredPane.add(rank4);

		rank5 = new JLabel("5.");
		rank5.setFont(new Font("Tahoma", Font.BOLD, 24));
		layeredPane.setLayer(rank5, 2);
		rank5.setBounds(40, 650, 250, 25);
		layeredPane.add(rank5);

		wuerfel = new JLabel("");
		
		wuerfel.setIcon(new ImageIcon(GUI.class.getResource("/view/6.png")));
		layeredPane.setLayer(wuerfel, 2);
		wuerfel.setBounds(440, 500, 200, 200);
		layeredPane.add(wuerfel);

		/*player = new JLabel();

        player.setIcon(new ImageIcon(GUI.class.getResource("/view/player_red.png")));
        player.setBounds(110,390,20,20);
        layeredPane.setLayer(player, 2);
        
        layeredPane.add(player,2);*/
      
        player1.setIcon(new ImageIcon(GUI.class.getResource("/view/player_red.png")));
        player1.setBounds(170,390,20,20);
        layeredPane.setLayer(player1, 2);
        layeredPane.add(player1,2);
        wuerfel = new JLabel("");
	}
	
	public void addMyListener(Controller controller) {
		wuerfel.addMouseListener(controller);
    }
	
	public void instPlayerLabel(JLabel l, String imgPath) {
		l.setIcon(new ImageIcon(GUI.class.getResource(imgPath)));
		l.setText(l.getName());
        l.setBounds(170,390,20,20);
        layeredPane.setLayer(l, 2);
        layeredPane.add(l,2);
	}
	
	public void addPlayers() {
		
		switch(SpielSetup.getPlayerNo()) {
		case 1: instPlayerLabel(player1, "/view/player_red.png");
				break;
		case 2: instPlayerLabel(player1, "/view/player_red.png");
				instPlayerLabel(player2, "/view/player_red.png");
				break;
		case 3: instPlayerLabel(player1, "/view/player_red.png");
				instPlayerLabel(player2, "/view/player_red.png");
				instPlayerLabel(player3, "/view/player_red.png");
				break;
		case 4: instPlayerLabel(player1, "/view/player_red.png");
				instPlayerLabel(player2, "/view/player_red.png");
				instPlayerLabel(player3, "/view/player_red.png");
				instPlayerLabel(player4, "/view/player_red.png");
				break;
		case 5: instPlayerLabel(player1, "/view/player_red.png");
				instPlayerLabel(player2, "/view/player_red.png");
				instPlayerLabel(player3, "/view/player_red.png");
				instPlayerLabel(player4, "/view/player_red.png");
				instPlayerLabel(player5, "/view/player_red.png");
				break;
		}
		
	}

}
