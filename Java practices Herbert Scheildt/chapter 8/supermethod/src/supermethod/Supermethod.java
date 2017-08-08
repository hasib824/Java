package supermethod;


public class Supermethod {


    public static void main(String[] args) {
      Boxweight as=new Boxweight(5,6);
      as.res();
    }
    
}
class Box{
   int i, j;
   Box(int a, int b)
   {
       i=a;
       j=b;
   }
   void showij()
   {
       System.out.println("The result is : "+ i*j);
   }
}
class Boxweight extends Box
{   
    int weight;
    Boxweight(int k,int l)
    {
        super(k,l);
    }
    void res()
    {
        showij();
    }
}

