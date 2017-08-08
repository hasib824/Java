package testy;

import java.io.*;

public class Testy {

    public static void main(String[] args) throws IOException{
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please Enter a Characters");
        int b=0; char c='a';
        do
        {
            b=a.read();
            System.out.println("The Data is : " +(char)b);
        }while(b!='q');
        

    }

}
