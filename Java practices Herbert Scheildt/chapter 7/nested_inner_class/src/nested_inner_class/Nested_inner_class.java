package nested_inner_class;

public class Nested_inner_class {
    public static void main(String[] args) {
    Box at=new Box();
    at.test();
    }    
}

class Box
{
    private int a;
    Box()
    {
       a=10;
    }
    void test()
    {   Inner an=new Inner();
        an.output();
    }
    class Inner
    {
        void output()
        {
            System.out.println("This is from the Inner class : "+a);
        }
    }   
}
