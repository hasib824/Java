package classlevel;
public class ClassLevel {

    public static void main(String[] args) {

    }
    
}

class Mythread extends Thread
{
    public void run()
    {
        synchronized(this)
        {
           for(int i=0;i<=10;i++)
           {
              System.out.println("Printing Mythread : ");
           }
        }
    }
}