package bufferdwriter;
import java.io.*;

public class BufferdWriter {

    
    public static void main(String[] args)throws Exception {
       File f=new File("H:\\javafiles\\BW");
       f.mkdir();
       File f1=new File(f,"BW.txt");
       f1.createNewFile();
       BufferedWriter bw=new BufferedWriter(new FileWriter(f1));
       String s="asibuzzaman";
       char ch[]={'c','h','o','w','d','h','u','r','y'};
       bw.write(72);
       bw.write(s);
       bw.newLine();
       bw.write("Khan");
       bw.newLine();
       bw.write(ch);
       bw.flush();
       bw.close();
      
      /*int a='H';
      System.out.println(a);
      */
    }
    
}
