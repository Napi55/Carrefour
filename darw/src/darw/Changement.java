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
import javax.imageio.ImageIO;



import javax.swing.*;

/**
 *
 * @author PC-DELL
 */
public class Changement extends JPanel implements Runnable,ActionListener {
int x=705;
int y=0;
int x2=0;
int y2=460;
Timer timer= new Timer(100, this);
Traversee1 i = new Traversee1();
Traversee2 i2 =new Traversee2();

 JPanel red1,green1 ,red2,green2;
int bb1=5;
int bb2=5;
Semaphore sfeu1;  
Semaphore sfeu2; 
Semaphore svoie2;
Semaphore svoie1;



    public Changement() {
    }
    
    

    public Changement(Semaphore sfeu1, Semaphore sfeu2, Semaphore svoie2, Semaphore svoie1) {
        this.sfeu1 = sfeu1;
        this.sfeu2 = sfeu2;
        this.svoie2 = svoie2;
        this.svoie1 = svoie1;
    }

    

 

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        timer.start();
////        this.add(i);
// for(int i=0;i<t1.length;i++){
// this.add(t1[i]);
// 
// }
   
        g.setColor(Color.BLUE);
        g.draw3DRect(0, 0, 600, 350, true);
        g.fill3DRect(0, 0, 600, 350, true);
        
                g.fill3DRect(0,550, 600, 350, true);
                                g.fill3DRect(800,550, 600, 350, true);
                            g.fill3DRect(800,0, 600, 350, true);
g.setColor(Color.BLACK);
g.drawLine(700, 0, 700, 340);
g.drawLine(1400, 450, 800, 450);
g.drawLine(0, 450, 600, 450);
g.drawLine(700, 550, 700, 900);
//        add(ch);
//ch.setBounds(0,0, 100,100);
Graphics2D g2d = (Graphics2D)g;
        
          
             
     File     img2File= new File("traficrouge.jpg"); 
         File  imgFile = new File("traficverre.jpg");   
     try {
        Image img = ImageIO.read(imgFile);
       
          g2d.drawImage(img, 500, 600, 40,70,null);
            Image img2= ImageIO.read(img2File);
       
          g2d.drawImage(img2,850,250,40, 70, null); 
    } catch (IOException ex) {
        JOptionPane.showConfirmDialog(null,ex.getMessage());
        
    }


       this.setLayout(null);
    //red1
    red1= new JPanel();
        red1.setBackground(Color.gray);
        red1.setBounds(505,646,30,20);
        this.add(red1);
       // green1
   green1= new JPanel();
   green1.setBackground(Color.GREEN);
           green1.setBounds(505,605,30,20);
        this.add(green1);
          
//red2
            red2= new JPanel();
                    red2.setBackground(Color.red);
        red2.setBounds(855,292,30,20);
                this.add(red2);
//green2
            green2= new JPanel();
       green2.setBackground(Color.gray);
        green2.setBounds(855,255,30,20);
        this.add(green2);


      
  this.add(i);
 
                       i.setBounds(x, y,90 , 900);
     i.setBackground(Color.red); 
     this.add(i2);
 
                       i2.setBounds(x2, y2,1400 , 90);
     i2.setBackground(Color.green);



    
    }

   

    @Override
    public void run() {
          int Feu=1;
        while(true)
{
           try {
               int tp=2000;
               sleep(tp);
               System.out.println(tp+"mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm");
           } catch (InterruptedException ex) {
               Logger.getLogger(Changement.class.getName()).log(Level.SEVERE, null, ex);
           }

if(Feu==1)
{
              
          sfeu1.P();
    
   sfeu2.V();
   
              
Feu=2;
    System.out.println("feu verre t2 on    ");
     green2.setBackground(Color.green);
     red2.setBackground(Color.gray);
     green1.setBackground(Color.gray);
          red1.setBackground(Color.red);
          bb1=-5;
          
            
}
else{
          
   
 sfeu1.V();
    
Feu=1;
 System.out.println("feu verre t1 on   ");
            green2.setBackground(Color.gray);
     red2.setBackground(Color.red);
     green1.setBackground(Color.GREEN);
          red1.setBackground(Color.GRAY);
          bb1=5;
          sfeu2.P();
        
}
    }
    
    }
 @Override
    public void actionPerformed(ActionEvent e) {
        
//  x+=bb1;
//  repaint();
    }
  
    

    }

  
   
    

