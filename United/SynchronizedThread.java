package synchronizedthread;

import java.util.logging.Level;
import java.util.logging.Logger;


public class SynchronizedThread {


    public static void main(String[] args) {
        Myprinter mp = new Myprinter();
              
        Mythread th = new Mythread(mp);
       th.start();
       
       Myprinter mp1 = new Myprinter();
       M2ndThread th2nd = new M2ndThread(mp1);
       Thread myth = new Thread(th2nd);
       myth.start();
       
      //  Myprinter mp1 = new Myprinter();
      // CommonThread th3 = new CommonThread(mp1,"Third Common Thread");
      // th3.start();
    //  CommonThread th4 = new CommonThread(mp1,"4th Common Thread");
      // th4.start();
    }
    
}


class Mythread extends Thread
{   
    Myprinter a;
    Mythread(Myprinter a)
    {
        this.a = a;
    }
    public void run()
    {
    
       a.printer("First Thread : ");
    }
}

class M2ndThread  implements Runnable // Because Runnable gives a opportunity to extends another class
{  

    Myprinter a; String s;
    M2ndThread(Myprinter a)
    {
        this.a = a;
    }
    public void run()
    {
       a.printer("Second Thread : ");
    }

}


class CommonThread extends Thread
{   
    Myprinter a;String s;
    CommonThread(Myprinter a,String s)
    {
        this.a = a;
        this.s = s;
    }
    public void run()
    {
    
       a.printer(s+" : ");
    }
}

class Myprinter
{
   static synchronized void printer(String s)
    {
        for(int i=0;i<=100;i++)
        {    
            System.out.println(s + i);
        }
    }
}
