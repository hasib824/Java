package myinterface;

import java.util.Scanner;


public class MyInterface {

       public static void main(String[] args) {
       Callback a=new Client();
       Client a1=new Client();
        a.callback(10);
        a1.notfound();
        A.NestedIf test= new Client();
       Scanner in=new Scanner(System.in);
       System.out.println("Please Enter a value : \n");
       int get=in.nextInt();
    }    
}

interface Callback
{
   void callback(int a);
}

class A
{
    int a; int b;
   public interface NestedIf
    {
        boolean checkit(int x);
    }
}

class Client implements Callback,A.NestedIf
{
    @Override
    public void callback(int a)
    {
        System.out.println("The value of a is : "+ a);
    }
    void notfound()
    {
        System.out.println("This can't be ovverride");
    }
    public boolean checkit(int x)
    {
        return x<0? true : false;
    }
}
class anotherclient implements Callback
{
    public void callback(int c)
    { 
        System.out.println("This is from another client");
    }
}
