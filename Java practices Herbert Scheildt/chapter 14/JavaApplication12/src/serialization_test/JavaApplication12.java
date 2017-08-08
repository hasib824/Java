
package serialization_test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/**
 *
 * @author Hasibuzzaman
 */
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        System.out.println("Desrilizing        ..............");
        My myobject2;
        FileInputStream fos1=new FileInputStream("H:\\abc.txt");
        
        ObjectInputStream oos1=new ObjectInputStream(fos1);
        myobject2=(My) oos1.readObject();
        System.out.println("myobject2.a : "+ myobject2.a+ "\nmyobject2.i : "+myobject2.i);
    }
    
}
class Myobject implements Serializable
{
    
    int a;
    int b;
Myobject()
{
   System.out.println("Myobjct Contructor called");
}
    public void ject(int a, int b) {
        //this.a = a;
        this.b = b;
    }
    
  
}

class My extends Myobject implements Serializable
{
    int i;
    int j;
My()
{
    System.out.println("Child_My contrctructor called");
}

}
