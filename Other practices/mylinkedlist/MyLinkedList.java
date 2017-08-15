
package mylinkedlist;
import java.util.*;

public class MyLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LinkedList<Integer> mlklst = new LinkedList();
        System.out.println("Printing Orginal LikedList");
        for(int i=1;i<=7;i++)
        {
            mlklst.add(10*i);
            System.out.println(mlklst.get(i-1));
        }
        
        MyStack.printit(mlklst);
        
         for(int i=1;i<=7;i++)
        {
            mlklst.add(10*i);
            
        }
        
        MyQueue.printit(mlklst);
        
        Vector<Double> mst = new Vector();
        
        for(int i=1;i<=7;i++)
        {
            mst.add(10.5*i);            
        }
        
        System.out.println("Capacity of vector is : "+mst.capacity());
        System.out.println("Size of vector is : "+mst.size());
        
        
        for(int i=1;i<=7;i++)
        {
            mst.add(10.5*i);            
        }
        
        System.out.println("Capacity of vector is : "+mst.capacity());
        System.out.println("Size of vector is : "+mst.size());
        
        
      
    }
    
}

class MyStack
{
 static  void  printit( LinkedList<Integer> mlklst)
   {   System.out.println("Printing Stack");
       for(;!mlklst.isEmpty();)
       {
        System.out.println(mlklst.getLast());
        mlklst.removeLast();
       }

   }
}

class MyQueue
{
      static void printit( LinkedList<Integer> mlklst)
   {   System.out.println("Printing Queue");
       for(;!mlklst.isEmpty();)
       {
        System.out.println(mlklst.getFirst());
        mlklst.removeFirst();
       }

   }
}