package wildcard1;


public class Wildcard1 {

    public static void main(String[] args) {
        Integer my[]={1,2,3,4,5};
        Double mine[]={1.0,2.0,3.0,4.0,5.0};
        Myclass<Integer> l=new Myclass<Integer>(my);
        Myclass<Double> mylo=new Myclass<Double>(mine);
        if(l.isequal(mylo))
        {
            System.out.println("They are equal"); 
       }
       else
        {
            System.out.println("Not equal");
        }
    }
    
}

class Myclass<T extends Number>
{    T [] A;
     T avgi;
     Myclass(T [] C)
     {
         A=C;
         avgi=A[0];
     }
    public T avg()
    {
        double sum=0.0;
        for(int i=0;i<A.length;i++)
        {
          sum=sum+A[i].doubleValue();  
        }
       return (sum/A.length);
    }
    
    public boolean isequal(Myclass<?> ob)
    {
        if(this.avg()==ob.avg())
        {
            System.out.println(avgi.getClass().getName()+" : " +avg());
            System.out.println(ob.avgi.getClass().getName()+" : " +ob.avg());
            return true;
        
        }
        
        else 
        {
            return false;
        
        }
    }
}