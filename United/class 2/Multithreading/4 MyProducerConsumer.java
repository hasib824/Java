package myproducerconsumer;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyProducerConsumer {

    static LinkedList<Integer> myQ;

    public static void main(String[] args) {

        myQ = new LinkedList();
       // myQ.push(10);
       producer(); 
       consumer();
         
        

    }

    public static void producer() {
        new Thread() {
            @Override
            public void run() {

                for (int i = 0; i < 50; i++) {

                    synchronized (myQ) {
                        if (myQ.size() == 50) {
                            System.out.println(this.getClass().getEnclosingMethod().getName()+" is full and going to waiting state ....");
                            
                            try {
                                myQ.wait();
                            } catch (InterruptedException ex) {
                                Logger.getLogger(MyProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            
                            
                        }
                        myQ.push(i);
                        System.out.println("Produced : "+ myQ.getFirst());
                        myQ.notifyAll();
                    }

                }

                //To change body of generated methods, choose Tools | Templates.
            }

        }.start();
    }

    public static void consumer() {
        new Thread() {
            @Override
            public void run() {

                while (true) {
                     
                    synchronized(myQ)
                    {
                        if(myQ.isEmpty())
                        {
                           System.out.println(this.getClass().getEnclosingMethod().getName()+" is going to waiting state ....");
                            try {
                                myQ.wait();
                            } catch (InterruptedException ex) {
                                Logger.getLogger(MyProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        
                         System.out.println("Consumed : "+ myQ.getFirst());
                         myQ.remove();
                         myQ.notifyAll();
                    }
                }

                //To change body of generated methods, choose Tools | Templates.
            }

        }.start();
    }

}
