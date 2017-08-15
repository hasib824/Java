
package mycollection;

import java.util.*;


public class MyCollection {

   
    public static void main(String[] args) {
        List<Integer> nmb = new LinkedList();
        
        nmb.add(10); nmb.add(15); nmb.add(20);
        nmb.add(30); nmb.add(20); nmb.add(50);
        
        Set<Integer> ghjk = new TreeSet();
        
        
        
        nmb.remove(new Integer(20));
        nmb.remove(new Integer(20));
        
        nmb.set(1, new Integer(51));
        
        Iterator iti= nmb.iterator();
        
        while(iti.hasNext())
        {
             System.out.println("Pop " +iti.next());
        }
        
       
        
       
        
        
        System.out.println("Agdom Bagdom");
        Collection<Integer> snmb = new ArrayList();
        
        snmb.add(70); snmb.add(80);
      
        snmb.addAll(nmb);
        
        for(int a : snmb)
        {
            System.out.println(a);
        }
        
        System.out.println("Ase kina : "+ snmb.containsAll(nmb));
        
        nmb.clear();
        
        System.out.println("Check if empty : "+ nmb.isEmpty()+"\nUsing Iterator : ");
        
        
        Iterator it= snmb.iterator();
        
        
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        
        
        List <Integer> mylist = new ArrayList(10);
        
        mylist.addAll(0, snmb);
        
        ListIterator lst= mylist.listIterator();
        
        System.out.println("Shob e ase dekha jay");
        
        while(lst.hasNext())
        {
            System.out.println(lst.next());
        }
        
        
        
    }
    
}
