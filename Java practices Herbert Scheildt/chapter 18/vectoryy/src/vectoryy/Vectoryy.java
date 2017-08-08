
package vectoryy;

import java.util.*;

public class Vectoryy {

    
    public static void main(String[] args) {
       Vector al=new Vector();
       al.addElement("Allah");
       al.addElement(10);
       al.addElement(true);
       Iterator i=al.iterator();
       while(i.hasNext())
       {
           System.out.println(i.next());
       }
       
       al.removeElement(true);
       Iterator i1=al.iterator();
        while(i1.hasNext())
       {
           System.out.println(i1.next());
       }
        System.out.println(al.size());
    }
    
}
