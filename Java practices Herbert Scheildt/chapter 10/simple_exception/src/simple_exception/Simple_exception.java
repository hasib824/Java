
package simple_exception;


public class Simple_exception {


    public static void main(String[] args) {
     try
     {
         int a=0;
         int x=15;
         int res=x/a;
     }
     catch(Exception e)
     {
         System.out.println(e);
         System.err.println(e); // print with red color 
         e.printStackTrace(); // Details with red color
     }
     finally
     {
         System.out.println("This is finished");
     }
    }
    
}
