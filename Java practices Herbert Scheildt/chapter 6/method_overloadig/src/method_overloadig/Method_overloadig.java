package method_overloadig;

import java.math.BigDecimal;

public class Method_overloadig {

    public static void main(String[] args) {
        Building a=new Building();
        System.out.println("1st overloading with no Parameter "+ a.build(15));
        System.out.println("2nd overloading with 3 Parameter "+ a.build(5,2,5));
        System.out.println( a.build());
        System.out.println("4th overloading with no Parameter "+ a.build(4.12,8.98));
        int i=88;
        System.out.println("5th overloading shows auto typecasting : ");a.build(5.0);
    }
}

class Building
{
    int width,height,length;
    int build(int width)
    { 
       return  width+height+length;
    }
    int build(int x,int y,int z)
    {
        width= x>y ? x: y;
        height = x<y ? y: x;
        length = z;
        return width*height*length;
    }
    String build()
    {
        return "This 3rd method is a String method that Overloaded";
    }
    double build (double x, double y)
    {
       double width,height;
       width=x;height=y;
       String one=new String();
       one=Double.toString(x);
       String two=new String();
       two=Double.toString(y);
       BigDecimal ek=new BigDecimal(one);
       BigDecimal ek2=new BigDecimal(two);
       ek=ek.add(ek2);
       double an=ek.doubleValue();
       return an;
    }
    double build(double a)
    {
        System.out.println("5th overloading shows : "+ a);
       return a;
    }
}
