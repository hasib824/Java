package mygetclass;


public class Test implements Cloneable
{
    int i = 5;
    
    public void  myMethod()
    {
        
    }
    
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}