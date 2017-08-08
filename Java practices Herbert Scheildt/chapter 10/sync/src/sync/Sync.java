package sync;

public class Sync {

    public static void main(String[] args) {
         Printer d=new Printer();
         Printer d1=new Printer();
         MyThread t1=new MyThread(d,"One");
         MyThread t2=new MyThread(d1,"Two");
    }

}

class Printer {

    public void wish(MyThread  a) {
        
        for (int i = 0; i <= 5; i++) {
            System.out.println(a.t.getName()+" Number : " + i);
            try {
                Thread.sleep(200);
            } catch (Exception e) {
            }
        }
        synchronized (Printer.class) {
            System.out.println(a.t.getName()+ "Sunchronized Started");
            for (int i = 65; i <= 75; i++) {
                System.out.println(a.t.getName()+ " Character : " + (char) i);
               /* try {
                 Thread.sleep(1000);   
                } catch (Exception e) {
                }*/
 
            }
            System.out.println(a.t.getName()+ "Sunchronized Ended");
        }
        for (int i = 100; i <= 105; i++) {
                System.out.println(a.t.getName()+"3rd Number : " + i);
            } 

    }
}

class MyThread implements Runnable
{   Thread t;
    String s;
    Printer as;
    MyThread(Printer as,String s)
    {   this.as=as;
        this.s=s;
        t=new Thread(this,s);
        t.start();
    }
    public void run()
    {   //System.out.println("Thread "+ t.getName()+ " Running ");
        as.wish(this);
    }
}
