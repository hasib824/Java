package filerreader;
import java.io.*;

public class FileRReader {

   
    public static void main(String[] args) throws Exception{
        File f=new File("H:\\Hasho\\me.txt");
        FileReader a=new FileReader(f);
        int c=a.read();
        /*while(c!=-1)
        {
            System.out.print((char)c);
            c=a.read();
        } */
        // a.close();
        int l=(int)f.length();
        System.out.println("\nLength is "+l);
        char ch[]=new char[l+1];
        int l1=a.read(ch);
       // int i=0;
        for(char x: ch)
        {
            System.out.print(x);
        }
        a.close();
    }
    
}
