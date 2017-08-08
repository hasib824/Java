package genmethod;

public class Genmethod {

    public static void main(String[] args) {
         Myclass ab=new Myclass();
         Integer a[]={4,7,9,12,13};
         int ac=12;
         Myclass.show(ac,a);
         
         String c[]={"Hasibuzzaman", "Khan", "Chowdhury"};
         String d="Khan";
         Myclass.show(d,c);
    }
    
}

class Myclass
{
    public  static <T extends Comparable, v extends T>void show(T a, v []b)
    {   boolean flag=false;
        for(int i=0;i<b.length;i++)
        {
            if(a.equals(b[i]))
            {
                flag=true;
                System.out.println("Yes Found at "+(i+1));
                break;
            }
        }
        if(flag==false)
        {
           System.out.println("Not Found "); 
        }
       
    }
}
