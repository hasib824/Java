
package agdom;

import java.util.ArrayList;


public class Agdom {

    
    public static void main(String[] args) {
       ArrayList<String> l =new ArrayList();
       l.add("Hasibuzzaman Chowdhury");
       l.add("Shakib khan");
       l.add("Shakil khan");
       AmarList a=new AmarList();
       a.m1(l);
       String s=l.get(0);
       System.out.println(l);
       
       
       
       
       
       /*MyList<String> l1=new MyList<String>();
       l1.add("Shakibuzzaman Khan");
       String s1=l1.get();
       System.out.println(s1);
       */
       
    }
    
}
class AmarList
{
    public void m1(ArrayList l)
    {
        l.add(10);
        l.add(45.56);
        l.add(true);
    }
}
class MyList<T>
{
    T ob;
    public void add(T e)
    {
        this.ob=e;
    }
    public T get()
    {
        return ob;
    }
}
