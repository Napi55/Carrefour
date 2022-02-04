/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darw;

import static java.lang.Thread.sleep;

/**
 *
 * @author PC-DELL
 */
public class Darw {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
               Semaphore svoie1 = new Semaphore(1,"svoie1");
Semaphore svoie2 = new Semaphore(1,"svoie2");
Semaphore sfeu1 = new Semaphore(1,"sfeu1");
Semaphore sfeu2 = new Semaphore(0,"sfeu2");
        
          Changement ch1= new Changement (sfeu1, sfeu2, svoie2, svoie1)  ;
              Thread cch1 = new Thread(ch1);
        cch1.start();
   
fc f = new fc(sfeu1, sfeu2, svoie2, svoie1,ch1);
int N=100;

        Traversee1 a[]= new Traversee1[N];
         Thread aa[]=new Thread[N];
         Traversee2 b[]= new Traversee2[N];
             Thread bb[]=new Thread[N]; 
        for(int i=0;i<a.length;i++){
              a[i]  = new Traversee1(svoie1, sfeu1);
         aa[i] = new Thread(a[i]);
          
     
      
                 b[i] = new Traversee2(svoie2, sfeu2);       
            bb[i] = new Thread(b[i]);

bb[i].start();
 aa[i].start();
       sleep(600); 
        
        }
        
      
       
 
    
    }
    
}
