package dynamicmethoddispatch;
import pkgabstract.Area;

public class DynamicMethodDispatch {

   
    public static void main(String[] args) {
       A a=new A();
       B b=new B();
       C c=new C();
       
       A r=b; // reference to a subclass
       r.show(); // dynamic method dispatch
       Area asd=new Area();
    }
    
}

class A
{
    int i,j;
    void show()
    {
        System.out.println("This is A");
    }
}
class B extends A
{   int b;
    void showc(int a)
    {   
        System.out.println("value of b is  : "+ b);
    }
    void show()
    {
        System.out.println("This is B");
    }
}
class C extends A
{   
    int c;
    void showc(int a)
    { 
        System.out.println("value of c is  : "+ c);
    }
    void show()
    {
        System.out.println("this is C");
    }
}
