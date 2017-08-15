
package generics;

import java.util.ArrayList;
import java.util.Scanner;

public class Generics {

    public static void main(String[] args) {
        MyGeneric mg= new MyGeneric();
        System.out.println("Please Enter A value : ");
        Scanner sc = new Scanner(System.in);
        
        //mg.<String>add(sc.nextLine(),mg);
        System.out.println("Output : "+  mg.<String>add(sc.nextLine(),mg).a);
        
        
    
    }
    
}


class MyGeneric<K extends Integer>
{
  String a;
<T> MyGeneric<?> add(T b,MyGeneric ob)
  {
      
      a=(String) b;
      
      return ob;
  }

  void add(ArrayList <? extends String> )
  {
      
  }

}