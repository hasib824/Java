package staticimport;
import static java.lang.Math.*;
import static java.lang.System.*;
public class Staticimport {
    public static void main(String[] args) {
    int a=5;
    int b=(int)pow(a,2);
    out.println(b);
    }
    
}

class A
{  A b=new A();
    A()
    {
        this();
    }
    A(int a,int b)
    {
        
    }
    A(A a)
    {
        
    }
}
