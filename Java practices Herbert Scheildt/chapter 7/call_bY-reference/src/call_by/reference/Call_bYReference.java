package call_by.reference;


public class Call_bYReference {
    static int a=10;
    public static void main(String[] args) {
       System.out.println("The value of a is : "+ a);
       Box a1=new Box();
       Call_bYReference a2=new Call_bYReference();
       a1.math(a2); // call by reference 
       System.out.println("The value of a is : "+ a);
       Box a3=a1.met(a1);
        System.out.println("The result is : "+ a3.a);
    }
    
}
class Box1
{
    int a,b;
}
class Box
{   
    int a;
    Box()
    {
        
    }
    Box(int i)
    {
        a=i;
    }
    void math(Call_bYReference ob)
    {    // Changing the orginal value of a from main class 
         ob.a=ob.a*2;
    }
    Box met(Box ob)
    {  
        ob.a=5;
        Box ob1=new Box(ob.a+10);
        return ob1;
    }
}
