package projectx;

import java.awt.*;

import javax.swing.JComponent;

public class BackgroundImage extends JComponent {

	private Image bgIgmage;
    public BackgroundImage(Image image) {
        this.bgIgmage = image;
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(bgIgmage, 0, 0, this);
    }
	
}
