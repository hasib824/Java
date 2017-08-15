package mylist;

import java.util.*;

public class MyList {

 
    public static void main(String[] args) {
      Stack<Integer> myStack = new Stack();
      
      for(int i=1;i<=7;i++)
      {
          myStack.push(10*i);
          myStack.peek();
      }
      
      ListIterator lst= myStack.listIterator();
      
        Integer next = (Integer) lst.next();
        
        next=(Integer) lst.next();
        
        System.out.println(next);
        
        lst.set(new Integer(5));
        lst.previous();
        System.out.println(lst.next());
        
        
        Stack<String> mst = new Stack();
        
        mst.add("hasibuzzaman");
        mst.add("Khan");
        
        ListIterator lti= mst.listIterator();
        
        lti.next();
        lti.add("Chowdhury");
        
        lti.previous();
     //   System.out.println(lti.next());
        
        ListIterator ltim= mst.listIterator();
        
        while(ltim.hasNext())
        {
            System.out.println(ltim.next());
        }
      
    }
    
}
