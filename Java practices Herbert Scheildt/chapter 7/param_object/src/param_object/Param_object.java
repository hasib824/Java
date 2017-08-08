package param_object;

public class Param_object {


    public static void main(String[] args) {
       Test O1= new Test(10,20);
       Test O2= new Test(50,100);
       Test O3= new Test(200,500);
       System.out.println("O1 == O1 : "+ O1.tstMethod(O1));
       System.out.println("O2 == O2 : "+ O2.tstMethod(O2));
       System.out.println("O3 == O1 : "+ O3.tstMethod(O1));
    }
}
class Test{
    int a,b;
    Test(int x,int y)
    {
        a=x;
        b=y;
    }
    boolean tstMethod(Test o)
    {
        return (o.a==a) && (o.b==b);
    }
}
