
package printtwriter;
import java.io.*;

public class PrinttWriter {

    
    public static void main(String[] args)throws Exception {
       File f=new File("H:\\javafiles");
       f.mkdir();
       File f1=new File("H:\\javafiles\\PW");
       f.mkdir();
       f=new File(f1,"PW.txt");
       f.createNewFile();
       
       if(f.isFile())
       {
           System.out.println("Yes the file is created");
       }
     // FileReader fw=new FileReader(f1);
      String st[];

       st=f1.list();    
      
      for(String s:st)
      {
          File f3=new File(f,s);
          if(f3.isFile())
          {
              System.out.println(s+ "Exists");
          }
          
      }  // end of For 
      
      PrintWriter bw=new PrintWriter(new FileWriter(f,true),true);
      bw.write(72);
      char ch[]={'a','s','i','b','u','z','z','a','m','a','n'};
      bw.write(ch);
      bw.println();
      bw.println("Khan");
      String se="Chowdhury";

      bw.println(se);
        // Here Flush method Ensures All dates Writes into the file 
      //bw.close();
      BufferedReader br=new BufferedReader(new FileReader(f));
      String sto=br.readLine();
      while(sto!=null)
      {
          System.out.println(sto);
          bw.println(sto);
          
          sto=br.readLine();
      }
      bw.flush();
      bw.close();
   
    }
    
}
