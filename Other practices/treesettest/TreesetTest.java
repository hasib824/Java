package treesettest;

import java.awt.BorderLayout;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;






public class TreesetTest {

    public static void main(String[] args) {
        // TODO code application logic here
        TreeSet<Myclass> ts = new TreeSet();
        Scanner sc = new Scanner(System.in);
        
        for (int i = 1; i < 10; i++) {
                    
            if (i == 5 || i == 4) {
               ts.add(new Myclass(8,8));
            } else {
               ts.add(new Myclass(i,i));
            }
          
            
        }
        
        System.out.println("ts size : "+ ts.size());
        
        for(Myclass mci: ts)
        {
            System.out.println("a : "+mci.a+" b : "+mci.b);
        }

    }

}

class Myclass implements Comparable<Myclass>{
    static int i=0;
    Integer a, b;
    
    Myclass(Integer a, Integer b)
    {
        this.a= a; this.b=b;
    }

    @Override
    public int compareTo(Myclass t) {
        System.out.println("Called "+(i++));
        Integer i=t.a;
        
        if(this.a>i) 
        {
            return -1;
        }
        else if(this.b<i)
        {
            return 1;
        }
        else 
            return -1;
        
    }
}

class MyComparator implements Comparator<Myclass> {

    @Override
    public int compare(Myclass t, Myclass t1) {
        Integer  i= (Integer)t.a;
        Integer j= (Integer) t1.a;
       
        
        return i.compareTo(j);
    }

}
