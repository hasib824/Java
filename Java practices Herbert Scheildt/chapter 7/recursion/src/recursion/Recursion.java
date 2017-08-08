package recursion;

import java.util.Scanner;


public class Recursion {


    public static void main(String[] args) {
        Fibo ob1=new Fibo();
        Scanner scan=new Scanner(System.in);
        System.out.println("How many Fibonacchi ? : ");
        int a=scan.nextInt();
        System.out.println("The fibonacchi numbers are : ");
        ob1.has(a);
        PrntArray ob2=new PrntArray();
        System.out.println("\nHow many ArrayData ? : ");
        a=scan.nextInt();
        for(int i=0;i<a;i++)
        {
            ob2.MyArray[i]=i*3;
        }
        System.out.println("\nThe array datas are : ");
        ob2.prnt(a);
    }    
}

class Fibo
{  
   int fib[]=new int[100];
   Fibo()
   {
       for(int i=0;i<100;i++)
       {
           fib[i]=-1;
       }
   }
   int has(int i)
   { 
      if(i==0) return 0;
      if(i==1) return 1;
      if(fib[i]==-1)
      {   
          fib[i]= has(i-1)+ has(i-2);
          System.out.print(" "+ (fib[i]) + " , " );
      }
      return fib[i];   
   }

}

class PrntArray
{
    int MyArray[]=new int[100];
    void prnt(int i)
    {
        if(i==0) return;  
        prnt(i-1);
        System.out.print(" "+MyArray[i]+", ");     
    }
}
