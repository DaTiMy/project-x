package projectx;

import javax.swing.*;
import java.awt.*;
class BackgroundImage extends JFrame
{
    JButton b1;
    JLabel l1;

    public BackgroundImage()
    {
        this.setTitle("Background Color for JFrame");
        this.setBounds(0, 0, 800, 800);
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        
    	JPanel panel = new JPanel();
    	panel.setSize(800,800);
    	JLabel background=new JLabel(new ImageIcon("C:/Users/Janik/Documents/GitHub/project-x/Project-X/bg.png"));
    	background.setLayout(new FlowLayout());
        panel.add(background);
        
        this.add(panel);
        this.pack();

    }

    public static void main(String args[])
    {
        new BackgroundImage();
    }
} 