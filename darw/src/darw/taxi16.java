/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darw;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author PC-DELL
 */
public class taxi16 extends JPanel implements ActionListener{
    Timer timer= new Timer(100, this);
    int x=30,y=0;
int bb1=5,bb2=5;
     @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        timer.start();
       Graphics2D g2d = (Graphics2D)g;
         File imgFile = new File("taxi16.png");
          
    try {
        Image img = ImageIO.read(imgFile);
       
          g2d.drawImage(img, x, y, 70, 40, null);
    } catch (IOException ex) {
        JOptionPane.showConfirmDialog(null,ex.getMessage());
    }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
    
}
