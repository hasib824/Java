package concur;

public class Concur {

    public static void main(String[] args) {
        Tester as = new Tester();
        Tester asd=new Tester();
        MyThread one = new MyThread(as, "First");
        System.out.println(one.t.getName() + " Thread Status : " + one.t.getState());
        YourThread two = new YourThread(as, "Second");
    }

}

class Tester {

    int a;
    String s;

     public void meth1() {
        System.out.println("Inside First Method");
        for (int i = 1; i <= 5; i++) {
            System.out.println("One : " + i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
               try {
                Thread.sleep(3000);
            } catch (Exception e) {
            }
        System.out.println("First Method Exiting ");
    }

     public void meth2() {
        System.out.println("Inside Second Method");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Two : " + i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
        
        System.out.println("Second Method Exiting ");
    }
}

class MyThread implements Runnable {

    Tester a;
    String s;
    Thread t;

    MyThread(Tester b, String s1) {
        this.a = b;
        this.s = s1;
        t = new Thread(this, s);
        t.start();
    }

    public void run() {
        //a.meth1();
        synchronized(a)
        {
            a.meth1();
        }
    }
}

class YourThread implements Runnable {

    Tester a;
    String s;
    Thread t;

    YourThread(Tester b, String s1) {   //System.out.println("Isn't it running );
        this.a = b;
        this.s = s1;
        t = new Thread(this, s);
        t.start();
    }

    public void run() {
      //  a.meth2();
        synchronized(a)
        {
            a.meth2();
        }
    }
}
