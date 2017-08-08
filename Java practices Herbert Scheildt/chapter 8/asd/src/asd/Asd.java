package asd;


public class Asd {

   
    public static void main(String[] args) {
       B a=new B(5);
       a.show();
    }
    
}
class A
{
    int A,B;
    A()
    {
        
    }
    A(int a,int b)
    {
        A=a;
        B=b;
    }

    void show()
    {
        System.out.println("This is 1");
    }
}
class B extends A
{
    int c;
    B(int d)
    {
        c=d;
    }
    void show()
    {
        System.out.println("This is B : "+ c);
    }
}