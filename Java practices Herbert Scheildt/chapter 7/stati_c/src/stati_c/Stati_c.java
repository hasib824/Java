package stati_c;

import static stati_c.Box.a;



public class Stati_c {

    public static void main(String[] args) {
        System.out.println("the value if Static a is : "+ a);
        Box an=new Box();
        
        Box b=new Box();
        b.a=7;
        Box c=new Box();
        System.out.println("the value if Static method : "+ an.add());
        System.out.println(a+" ,"+an.a+" ,"+b.a+" ,"+c.a);
        
    }  
}

class Box{
    static  int a;
    static int b;
    static
    {
        a=5;
        b=3;
    }
int add()
   {
       return a*b;
   }
}
