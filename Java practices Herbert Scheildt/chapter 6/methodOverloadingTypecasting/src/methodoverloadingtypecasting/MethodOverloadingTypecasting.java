
package methodoverloadingtypecasting;


public class MethodOverloadingTypecasting {


    public static void main(String[] args) {
        Box a=new Box();
        int i=88;
        a.re(i);
        a.re(128.23);
        a.re(98);
    }
    
}

class Box
{
    int a, b, c;
    Box () // Constructor overloading 
    {
         a=b=c=0;         
    }
    void re(double a)   // Method Overloading 
    {
        System.out.println("The value double : "+ a );
    }
    void re(int a)
    {
        System.out.println("The value int : "+ a + " Yea ,that's fine");
    }
}
