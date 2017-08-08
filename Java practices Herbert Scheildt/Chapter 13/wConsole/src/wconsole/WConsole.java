package wconsole;
import java.io.*;

public class WConsole {


    public static void main(String[] args) {
      PrintWriter ob=new PrintWriter(System.out,true);
      ob.println("This is a String");
      ob.println(10);
      ob.println(45.67);
      ob.println(ob);
     }
    
}
