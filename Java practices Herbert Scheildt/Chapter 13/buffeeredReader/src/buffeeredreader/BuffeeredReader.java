package buffeeredreader;

import java.io.*;
public class BuffeeredReader {

    public static void main(String[] args)throws IOException{
      File f=new File("H:\\Javafiles\\BR");
      f.mkdir();
      File f1=new File(f,"BR.txt");
      f1.createNewFile();
     // FileReader fw=new FileReader(f1);
      String st[];

       st=f.list();    
      
      for(String s:st)
      {
          File f3=new File(f,s);
          if(f3.isFile())
          {
              System.out.println(s+ "Exists");
          }
          
      }  // end of For 
      
      BufferedWriter bw=new BufferedWriter(new FileWriter(f1,true));
      bw.write(72);
      char ch[]={'a','s','i','b','u','z','z','a','m','a','n'};
      bw.write(ch);
      bw.newLine();
      bw.write("Khan");
    //  bw.newLine();
      String se="Chowdhury";
      bw.newLine();
      bw.write(se);
      bw.flush();  // Here Flush method Ensures All dates Writes into the file 
      //bw.close();
      BufferedReader br=new BufferedReader(new FileReader(f1));
      String sto=br.readLine();
      bw.newLine();
      while(sto!=null)
      {
          System.out.println(sto);
          bw.write(sto);
          bw.newLine();
          sto=br.readLine();
      }
      bw.flush();
      bw.close();
      
    }
    
}
