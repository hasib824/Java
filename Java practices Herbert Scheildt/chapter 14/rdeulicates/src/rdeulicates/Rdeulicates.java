
package rdeulicates;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class Rdeulicates {

  
    public static void main(String[] args) {
        
                ArrayList<String> df= new ArrayList();
                //df.add("hasib");df.add("hasib");df.add("hasib");
              //  df.add("shakib");
                Set<String> citySet = new HashSet<String>();
               citySet.add("hasib");citySet.add("hasib");
               citySet.add("hasib");citySet.add("hasib");
               citySet.add("Shakib");citySet.add("Shakib");citySet.add("Shakib");
                citySet.add("Shakil");citySet.add("Shakil");
              //  df.clear();
                df.addAll(citySet);
                
                for(String a : citySet)
                {
                    System.out.println(a);
                }
    }
    
}
