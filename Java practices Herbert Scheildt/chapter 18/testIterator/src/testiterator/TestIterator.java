package testiterator;

import java.util.*;

public class TestIterator {

    public static void main(String[] args) {
        ArrayList a=new ArrayList(); 
        a.add("Hasibuzzaman");
        a.add(10);
        a.add(true);
        a.add(45.52);
        
        Iterator i=a.iterator();
        
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        a.remove(true);
        a.remove(2);
        System.out.println("\n");
        Iterator j=a.iterator();
         while(j.hasNext())
        {
            System.out.println(j.next());
        }
    }
    
}

