package c.programming;
import java.io.*;

public class CProgramming {

   
    public static void main(String[] args)throws Exception {
       File f=new File("H:\\Javafiles\\programmes");
      // Writing to outpu.txt
      File f1=new File("H:\\Javafiles\\programmes\\output\\output.txt");
       FileWriter f2=new FileWriter(f1,true);
       System.out.println("File : "+ f1.exists());
       PrintWriter pw=new PrintWriter(f2,true);
       // End of Writing
       String s[];
       s=f.list();
       File f3;
       BufferedReader bw;
       for(String a: s)
       {
          f3=new File(f,a);
          if(f3.isFile())
          {   String s1;
              bw=new BufferedReader(new FileReader(f3));
              pw.println("Information of :"+ a);
              System.out.println("Information of :"+ a);
              s1=bw.readLine();
              while(s1!=null)
              {
                  pw.println(s1);
                 System.out.println(s1);
                  s1=bw.readLine();
                  
              }
            
              pw.println();
              pw.flush();
              bw.close();
             
          }
         
       }
        pw.close();
    }
    
}
