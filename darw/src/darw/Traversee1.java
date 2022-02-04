/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darw;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.Animation;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 *
 * @author PC-DELL
 */
public class Traversee1 extends JPanel implements ActionListener,Runnable {
int x=10,y=0;
int cc1=5,bb2=5,cc2=0;
int sg=5;
int temp=100;
Timer timer= new Timer(temp, this);
Semaphore svoie1 ;
boolean you;
  taxi tx1 = new taxi();
Semaphore sfeu1 ;
    public Traversee1() {
    }
     public  Traversee1(Semaphore svoie1, Semaphore sfeu1) {
        this.svoie1 = svoie1;
        this.sfeu1 = sfeu1;
       
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        timer.start();
    this.add(tx1);
  tx1.setBounds(x, y, 100, 100);
    }

   


    @Override
    public void actionPerformed(ActionEvent e) {
      
   if(y==250){
       
   
   }
      y+=cc1;
     
      System.out.println(cc1+" hadi");
      repaint();
    
        
    }
     @Override
    public void run() {
    

    svoie1.P();
    sfeu1.P();
 

       cc1=-5; 
 System.out.println("Traversee1 cercule ");
 
 
 
 sfeu1.V();
 svoie1.V();

       
     
}}
