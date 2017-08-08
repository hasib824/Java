
package mylinkelist;


import java.util.*;

/**
 *
 * @author Administrator
 */
public class MyLinkeList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         LinkedList add=new LinkedList();
         add.addFirst("Allah");
         add.addFirst("Malik");
         add.add(1,786);
         
         Iterator i=add.iterator();
         
         while(i.hasNext())
         {
             System.out.println(i.next());
         }
    }
    
}
