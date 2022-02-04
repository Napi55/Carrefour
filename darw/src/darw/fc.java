/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darw;

import java.awt.Color;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author PC-DELL
 */
public class fc extends JFrame {


    JPanel red1,green1 ,red2,green2;
           Semaphore sfeu1;  
Semaphore sfeu2; 
Semaphore svoie2;
Semaphore svoie1;
    public fc(Semaphore sfeu1, Semaphore sfeu2, Semaphore svoie2, Semaphore svoie1, Changement c) {
 

        this.sfeu1 = sfeu1;
        this.sfeu2 = sfeu2;
        this.svoie2 = svoie2;
        this.svoie1 = svoie1;
    Changement ch=c;

        this.setTitle("Carrefour");
        this.setSize(1400,900);
        this.setResizable(false);
        this.setLocation(300,80);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.show();
        this.add(ch);
     


    
    }

   
       
        
    

 

    
}
