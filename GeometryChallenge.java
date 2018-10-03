/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometry.challenge;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author jword
 */
public class GeometryChallenge extends JPanel{
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.WHITE);		
        g.setColor(Color.RED);

        int x = 10;
        int y = 100;
        int size = 50;             

        g.fillRect(x, y, size, size); 		
    }
    
    public static void main(String[] args) {
        JFrame f = new JFrame("Geometry Challenge");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GeometryChallenge gc = new GeometryChallenge();
        f.add(gc);
        f.pack();
        f.setSize(600,400);
        f.setPreferredSize(new Dimension(600, 400));
        f.setVisible(true);        
    }
    
}
