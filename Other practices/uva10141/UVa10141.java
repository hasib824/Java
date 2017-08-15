// problem link 
// https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=24&page=show_problem&problem=1082

package uva10141;

import java.util.*;


public class UVa10141 {
     
   
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       
        float n=1;  int it=1;
        float p;
        float compliance= -1.0F;
        String selected="";
        float cprice=0.0F;
      while(n!= 0)
      {
         n=sc.nextInt();
        p= sc.nextInt();
        while(n!= 0)
        {          
           sc.nextLine();
         
            for(int i=0;i<n;i++) 
            {   
                sc.nextLine();
            }    
            
            for(int i=0;i<p;i++)
            { 
                String RFP=sc.nextLine(); 
             
                float price = sc.nextFloat(); 
                float requirement_met= sc.nextFloat();
                float comp = requirement_met/n;
                if(comp>compliance)
                {
                    compliance= comp;
                    selected = RFP;
                    cprice=price;
                }
                else if(compliance == comp)
                {
                    if(price<cprice)
                    {
                      compliance= comp;
                      selected = RFP;
                      cprice=price;
                    }
                }              
                sc.nextLine();
                for(int j=0;j<requirement_met;j++) 
                { 
                    sc.nextLine();
                }
            }      
           System.out.println("RFP #"+(it++)+"\n"+selected+"\n");
           
        }
      }
        
    }

  
    
}



/*
// problem link 
// https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=24&page=show_problem&problem=1082

package uva10141;

import java.util.*;


public class UVa10141 {
     
   
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       // ArrayList<DataHolder> al;
        float n;  int it=1;
        float p;
        float compliance= -1.0F;
        String selected="";
        float cprice=0.0F;
       // System.out.println("Please enter Requirermentr");
       // n=sc.nextInt(); 
        n=sc.nextInt();
        p= sc.nextInt();
        while(n!= 0)
        {  
         //   al = new ArrayList(); 
          //  System.out.println("Please enter proposal : "+ n);
           
            sc.nextLine();
           // System.out.println("Please enter requirements");
            for(int i=0;i<n;i++) 
            {   
                sc.nextLine();
            }    
            
            for(int i=0;i<p;i++)
            {  // System.out.println("Please enter RFP, price and requirements meet");
               // requirement_met=sc.nextInt();
                String RFP=sc.nextLine(); float price = Float.parseFloat(sc.nextLine()); float requirement_met= Float.parseFloat(sc.nextLine());
                float comp = requirement_met/n;
                if(comp>compliance)
                {
                    compliance= comp;
                    selected = RFP;
                    cprice=price;
                }
                else if(compliance == comp)
                {
                    if(price<cprice)
                    {
                      compliance= comp;
                      selected = RFP;
                      cprice=price;
                    }
                }
                //al.add(new DataHolder(RFP, price,()));
                for(int j=0;j<requirement_met;j++) 
                {
                    sc.nextLine();
                }
            }
           // Collections.sort(al);
            
         
          // System.out.println("RFP #"+(it++)+"\n"+al.get(0).RFP+ "Comp : "+ al.get(0).complience+ "Price "+al.get(0).price);
           System.out.println("RFP #"+(it++)+"\n"+selected+"\n");
           
        }
    }

  
    
}

class DataHolder implements Comparable<DataHolder>
{
    String RFP;
    float price; 
    float complience;

    public DataHolder(String RFP, float price, float complience) {
        this.RFP = RFP;
        this.price = price;
        this.complience = complience;
    }    

    @Override
    public int compareTo(DataHolder t) {
      Float i=t.complience;
      if(this.complience>i) return -1;
      else if(i.equals(this.complience)) 
      {
          if(this.price<t.price)
          {
              return -1;
          }
          else
          {
              return 1;
          }
      }
      else return 1;
          
    }
}
*/
