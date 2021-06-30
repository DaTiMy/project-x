package view;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
class BackgroundImage
{
	BufferedImage myPicture;
	JLabel background;
	
    public BackgroundImage() 
    {
		try {
			myPicture = ImageIO.read(this.getClass().getResource("bg.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
    	background = new JLabel(new ImageIcon(myPicture));

    }
} 