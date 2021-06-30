package view;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

class Grid extends JPanel {
    @Override
    protected void paintComponent(Graphics g){
    	 super.paintComponent(g);
    	 Graphics2D g2d = (Graphics2D)g;
    	 // Assume x, y, and diameter are instance variables.
    	 Ellipse2D.Double circle = new Ellipse2D.Double(0, 0, 300, 300);
    	 g2d.fill(circle);
       
    }   
}