/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darw;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC-DELL
 */
public class Semaphore {
  int n;
String name;
public Semaphore (int max, String S)  {
n=max;
name=S;

}
public synchronized void P()  { 
  if(n==0){

      try {
          wait();
      } catch (InterruptedException ex) {
          Logger.getLogger(Semaphore.class.getName()).log(Level.SEVERE, null, ex);
      }
  
  }
    n--;
  
  }
    

public synchronized void V()  {
n++;

notifyAll();
}
}  

