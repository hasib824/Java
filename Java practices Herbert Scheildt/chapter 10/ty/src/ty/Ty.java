package ty;


public class Ty {

   
    public static void main(String[] args) {
       Mythread t= new Mythread();
       t.setPriority(10);
       t.start();
       for(int i=0;i<=10;i++)
        {
            System.out.println("Parent : "+ i);
        }
    }
    
}
class Mythread extends Thread
{
    @Override
    public void run()
    {
        for(int i=0;i<=10;i++)
        {
            System.out.println("child : "+ i);
        }
    }
}