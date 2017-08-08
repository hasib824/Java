
package javaapplication7;

public class JavaApplication7 {

    
    public static void main(String[] args) {
        
    }
    
}

class Mythread implements Runnable
{
    int a;

    public int getA() {
        return a;
    }
    
    public void run()
    {
        Thread.sleep(1000);
        System.out.println();
    }
}