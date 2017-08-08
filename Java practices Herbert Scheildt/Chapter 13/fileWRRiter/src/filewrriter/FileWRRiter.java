
package filewrriter;
import java.io.*;
public class FileWRRiter {
    public static void main(String[] args)throws Exception {
       /*File f=new File("H:\\Banglapara");
       f.mkdir();
       //File f2=new File("Mw.txt");
       String s="ami.txt";
       File f1=new File(f,s);
       //f1.createNewFile();
       /*FileWriter fw=new FileWriter(f1);
       fw.write("naana Khan"); //Ovverrides the existing datas 
       fw.write("Dada Khan"); */
       // Appending with existing datas 
       FileWriter fw=new FileWriter("H:\\Banglapara\\am i.txt",true);
       
     //  fw.write("Hasibuzzaman \n Khan"); //Ovverrides the existing datas 
      // fw.write('\n');
      // fw.write("Shakibuzzaman Khan");
       char ch[]={' ','A','r','e','f','i','n'};
       fw.write(ch);
       fw.flush();// to give the guranteee all data including last data is written to the file 
       fw.close();
    }
    
}
