
package javaapplication6;

import java.io.File;


public class JavaApplication6 {

  
    public static void main(String[] args) {
        File a=new File("H:\\agdom");
        System.out.println("Hello");
        a.mkdir();
        
        File ab= new File(a,"has");
        ab.mkdir();
    }
    
}
