package myhashmap;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MyHashMap {

    public static void main(String[] args) {
        IdentityHashMap<String, Double> me = new IdentityHashMap();

        String s= new String("Hasib");
        String s1= new String("Hasib");
        String s2= new String("Hasib");
        
        me.put(s, new Double(10));
        me.put(new String("Shakib"), new Double(7));
        me.put(new String("Shakil"), new Double(27));
        me.put(s1, new Double(22));
        me.put(s2, new Double(26));

        Set<Map.Entry<String, Double>> entrySet = me.entrySet();
        
        Iterator it = entrySet.iterator();
        for (Map.Entry<String, Double> next : entrySet) {
           // Map.Entry next = (Map.Entry)it.next();
           System.out.println("Key : "+next.getKey()+" | Value :"+next.getValue());
        }
        
        System.out.println("Test : "+ me.get(s1));
    }

}
