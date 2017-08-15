
package mysortedset;
import java.util.*;


public class MySortedSet {

    public static void main(String[] args) {
     
        Scanner sc= new Scanner(System.in);
        System.out.println("How many ? :");
        int n=sc.nextInt();
        System.out.println("Please Enter the values : ");
        ArrayList<Double> ar = new ArrayList(10);
        for(int i=0;i<n;i++)
        {
            ar.add(sc.nextDouble());
            
        }
        
        System.out.println("Orginal ArrayList : ");
        
        for(int i=0;i<ar.size();i++)
        {
           System.out.println(ar.get(i));
        }
        Properties p= new Properties();
        System.out.println("Sorted ArrayList :");

       SortIt<Double> asd = new SortIt();
       
        SortedSet<Double> sorted = asd.getSorted(ar);
        
        Iterator it = sorted.iterator();
        
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println("Please Enter Headset : ");
        
        
         System.out.println(sorted.headSet(new Double(sc.nextInt())));
        
        System.out.println("Please Enter Tailset : ");
        
                
        System.out.println(sorted.tailSet(new Double(sc.nextInt())));
        
        System.out.println("Please Enter SubSet : ");
        
        System.out.println(sorted.subSet(new Double(sc.nextInt()),new Double(sc.nextInt())));
        
        System.out.println("First Element is : "+sorted.first());
        System.out.println("Last Element is : "+sorted.last());
        
   
        
        
        
        
        Double a= 45.5;
        
        a.compareTo(a);
        
    }
    
}

class SortIt<T>
{
   SortedSet<T> srt ;
    
 SortedSet<T> getSorted(ArrayList<? extends Number> st)
{
    
   srt = new TreeSet(new MyComparator());
   Iterator it= st.iterator();
   while(it.hasNext())
   {
       srt.add((T)it.next());
   }
   return srt;
}


}
class MyComparator<T extends Comparable>  implements Comparator 
{
   Object a;
    @Override
    public int compare(Object t, Object t1) {
        T i= (T) t;
        T i1= (T) t1;
        if(i.equals(i1))
            return 0;
        else if(i.compareTo(i1)== 1)
            return -1;
        else return 1;
        
    }
    
}




