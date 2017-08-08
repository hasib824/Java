package finally_key;

import com.sun.jmx.remote.util.EnvHelp;
import java.io.IOException;

public class Finally_key {

    public static void main(String[] args) {
        // Finally_three.fa();
         try {
          Finally_three.fb();   
        } catch (Exception e) {
             System.out.println("In top : "+ e);
             System.out.println("cause : "+ e.getCause());
        }  // end of First try 
        try {
            Finally_three.fa();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(e.getCause());
        }
    }
 
    
}

class Finally_three
{
    static void fa()
    {
        
      System.out.println("Inside A");
      ArrayIndexOutOfBoundsException as= new ArrayIndexOutOfBoundsException("A : limit exists");
      as.initCause(new IOException("Moloto aita I/O Exception er karone ghoteche"));
      throw as;
    }
    static void fb()
    {
        try {
            System.out.println("Inside B");
            int c=10/0;
        } catch (Exception e) {
            throw new ArithmeticException("firaiya metod er kase dise");
        }
        finally
        {
            System.out.println("B's Finallay Executed");
        }
    }
}
