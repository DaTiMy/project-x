package projectx;

import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
class BackgroundImage
{
	JPanel panel;
	BufferedImage myPicture;
	JLabel background;
	
    public BackgroundImage() 
    {
        
        panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBorder(BorderFactory.createLoweredBevelBorder());
		try {
			myPicture = ImageIO.read(this.getClass().getResource("bg.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
    	background = new JLabel(new ImageIcon(myPicture));
        panel.add(background);

    }
} 