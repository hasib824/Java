package mythread;


public class Mythread {

    
    public static void main(String[] args) {
       Thready d=new Thready();
       Thread1 as=new Thread1(d);
       Thread2 asd=new Thread2(d);
       as.start();
       asd.start();
       
    }
    
}
class Thready 
{
    public synchronized void number()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("number : "+  i);
            try
                    {
                        Thread.sleep(0);
                    }
            catch(InterruptedException e)
            {
                
            }
        }
    }
    public  void charo()
    {
        for(int i=65;i<=75;i++)
        {
            System.out.println("Character : " + (char)i);
            try
                    {
                        Thread.sleep(100);
                    }
            catch(InterruptedException e)
            {
                
            }
        }
    }
}


class Thread1 extends Thread 
{  Thready t;
   Thread1(Thready t)
           {
               this.t=t;
           }
   public void run()
   {
       t.number();
   }
}

class Thread2 extends Thread 
{  Thready t;
   Thread2(Thready t)
           {
               this.t=t;
           }
   public void run()
   {
       t.charo();
   }
}