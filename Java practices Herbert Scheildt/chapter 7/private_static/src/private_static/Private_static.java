package private_static;

import static private_static.Box.a;


public class Private_static {

 
    public static void main(String[] args) {
      System.out.println("The private value is : "+ a);
      Box as=new Box(7);
      System.out.println("The values is : "+ a);
      int a[]=new int[10];
      System.out.println("The length of the array is : "+ a.length);
    }   
}
class Box
{
    static int a;
    static
    {
        a=5;
    }
    Box(int a)
    {
        this.a=a;
    }
    int add()
    {
        return a*5;
    }
}