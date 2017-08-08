package recur;

import java.util.Scanner;

public class Recur {


    public static void main(String[] args) {
       Scanner a=new Scanner(System.in);
        System.out.println("Please Enter a Value : ");
       int n=a.nextInt();
       Factorial f=new Factorial();
       System.out.println("The result is : " + f.fact(n));
       
    }
    
}

class Factorial
{   int res;
    int fact(int n)
    {   
        if (n==1) return 1;
        if(n==2) return 2;
        res=n*fact(n-1);
        return res;
    }
}
