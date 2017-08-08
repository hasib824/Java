
package serialization_test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class Serialization_test {

   
    public static void main(String[] args) throws Exception{
      My myobject = new My();
      myobject.ject(10, 20);
        System.out.println("agdom : "+ myobject.a);
        FileOutputStream fos=new FileOutputStream("H:\\abc.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(myobject);
        
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
    
    int a=50;
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
    int i=10;
    int j=20;
My()
{
    System.out.println("Child_My contrctructor called");
}

}
