package collectioninterface;

import java.util.*;


public class CollectionInterface {

   
    public static void main(String[] args) {
      ArrayList<String> a=new <String>ArrayList();
      a.add("Hasibuzzaman");
      a.add("Shakibuzzaman");
      a.add("Shakiluzzaman");
      a.add("chowdhury");
      //a.addAll("hasibuzzaman","Khan");
      System.out.println(a.contains("chowdhury"));
      System.out.println(a.contains("Shakiluzzaman"));
     // a.remove("chowdhury");
      System.out.println(a.contains("chowdhury"));
      System.out.println(a.contains("chowdhury"));  
      
      ArrayList<String> b=new ArrayList();
       b.addAll(a);
       b.add("Shakhawat");
       b.add("Saimor");
       b.add("Tameem");
       b.add("Arif");
       System.out.println("B er size dehi : " +b.size());
       String s=b.set(1, "Hasibuzzaman");
       System.out.println(" Set ki return korse : "+s);
       b.set(0, "Shakibuzzaman");
       b.set(2, "chowdhury");
       b.set(3, "Shakiluzzamany");
       for(String i:a)
       {
           System.out.println(i);
       }
        System.out.println("Printing B \n");
       for(String i:b)
       {
           System.out.println(i);
       }
       
        System.out.println("A ki aseni ? : "+ b.containsAll(a));
        
        Iterator ob=b.iterator();
       /*  
       b.remove("Tameem");
       System.out.println("Tameem Ase ki  ?"+b.contains("Tameem"));
       b.retainAll(a);
       System.out.println("A er shobai ase ki ?"+b.containsAll(a));
       System.out.println("A bade Baki gola ase ki :  ?"+b.contains("Shakhawat"));
       b.removeAll(a);
       System.out.println("A er shobai ase ki ?"+b.containsAll(a));
       a.clear();       
       System.out.println("O mono A er vitre kiccho aseni ? "+ a.isEmpty());
       */
       
       
      //ab ki =new b();
      //ki.abc();
    }
    
}

class ab
{
    public void abc()
    {
        
    }
}

class b extends ab
{
  public void abc()
   {
       System.out.println("This is it");    
   }
  public void keda()
  {
      System.out.println("O mono tomi keda");
  }
}
