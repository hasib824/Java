package crfile;
import java.io.*;

public class Crfile {

   
    public static void main(String[] args) throws IOException{
        //File f1=new File("H:\\me.txt");
       // File f=new File();
      //  f.mkdir();
        File f1=new File("H:\\Agdom","me.txt");
        f1.mkdir();
       // System.out.println(f.exists());
        
       // f1.createNewFile();
        System.out.println(f1.exists());
    }
    
}
