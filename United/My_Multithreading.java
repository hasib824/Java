package my_multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;


public class My_Multithreading {

  
    public static void main(String[] args) {
       Mythread th = new Mythread();
       th.start();
       M2ndThread th2nd = new M2ndThread();
       Thread myth = new Thread(th2nd);
       myth.start();
    }
    
}

class Mythread extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                Logger.getLogger(Mythread.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("First Thread: " + i);
        }
    }
}

class M2ndThread extends Number implements Runnable // Because Runnable gives a opportunity to extends another class
{  

    public void run()
    {
        for(int i=0;i<10;i++)
        {
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                Logger.getLogger(Mythread.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Second Thread : " + i);
        }
    }

    @Override
    public int intValue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long longValue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float floatValue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double doubleValue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

