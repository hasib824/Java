package methodoverridingbyarea;


public class MethodOverridingByArea {

    public static void main(String[] args) {
       Rectangle a=new Rectangle(10,20);
        System.out.println("The area of rectangle is : "+ a.area());
        Triangle b=new Triangle(15, 20);
        System.out.println("The area of Triangle is : "+ b.area());
    }
    
}

class Area
{
    int dim1,dim2;
    Area()
    {
        
    }
    Area(int a,int b)
    {
        dim1=a; dim2=b;
    }
    int area()
    {
        System.out.println("not specified");
        return 0;
    }
}
class Rectangle extends Area
{
    Rectangle(int a,int b)
    {
        super(a,b);
    }
    int area()
    {
        return dim1*dim2;
    }
}
class Triangle extends Area
{
    Triangle(int a,int b)
    {
        super(a,b);
    }
    int area()
    {
      return dim1*dim2/2;
    }
    
}