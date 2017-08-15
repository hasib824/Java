
package stringandstringbuffer;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class StringAndStringBuffer {


    public static void main(String[] args) {
      TreeSet ts= new TreeSet(new MyComparator());
      ts.add("A");
      ts.add("C");
      ts.add("D");
      ts.add("B");
      ts.add(new StringBuffer("F"));
      ts.add(new StringBuffer("E"));
      ts.add(new StringBuffer("G"));
      
      Iterator it = ts.iterator();
      for(;it.hasNext();)
      {
         System.out.println(it.next().toString());
      }

    }
    
}

class MyComparator implements Comparator
{

    @Override
    public int compare(Object t, Object t1) {
        String i= t.toString();
        String i1= t1.toString();
        
        
        return i.compareTo(i1);
    }

}


