package mypriorityqueue;

import java.util.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeSet;


public class MyPriorityQueue {

   
    public static void main(String[] args) {
        
        TreeSet ts= new TreeSet();
        
        
        
        PriorityQueue<Integer> pq= new PriorityQueue<Integer>(10,new Myclass());
        
        pq.add(5); pq.add(10); pq.add(9); pq.add(6);
        
        List<Integer> ls= new ArrayList();
        ls.add(5); ls.add(10); ls.add(9); ls.add(6);
        
        System.out.println("Binary Search : "+ Collections.binarySearch(ls, 9, new Myclass()));
        
        System.out.println("list : "+ls);
        
        System.out.println("My Prioriy queue is : " + pq+ " size "+pq.size());
        
        
        
        
        for(int i=0;i<4;i++)
        {
            System.out.println(pq.remove());
                 
        }
    }
    
}

class Myclass<T extends Comparable> implements Comparator
{
    T a,b;
    @Override
    public int compare(Object t, Object t1) {
         a=(T)t; b=(T)t1;
         
         if(a.compareTo(b)== 1) return -1;
         else if(a.compareTo(b)==-1) return 1;
         else return 0;
        
    }
    
}