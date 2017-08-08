package mymethod;


public class MyMethod {


    public static void main(String[] args) {
      Arithmatic one=new Arithmatic();
      one.add(5, 10);
      int a=one.mul(5, 10);
      System.out.println("The return type method's result is  : "+(a));
    }
    
}
class Arithmatic{
   int a,b;
   void add(int x,int y)
   {
       a=x;b=y;
       System.out.println("The result is : "+(a+b));
   }
     int mul(int x,int y)
   {
       a=x;b=y;
       return a*b;
     
   }
}
