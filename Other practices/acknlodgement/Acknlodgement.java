package acknlodgement;

import java.io.*;
import java.net.*;
import java.util.*;


public class Acknlodgement {

    public static void main(String[] args) throws Exception{
       System.out.println("**********I am Client**********");
        
        Scanner sc= new Scanner(System.in);
       
       Socket sk = new Socket("127.0.0.1",1545);
       
       Scanner input_from_server= new Scanner(sk.getInputStream());
       
       PrintStream send_to_server = new PrintStream(sk.getOutputStream());
       
        System.out.println("Please Enter a String : ");
        
        String str;
        
        while(true)
        {
            str = sc.nextLine();
            
            send_to_server.println(str);
            
            String str2 = input_from_server.nextLine();
            
            System.out.println("SerVer received : "+ str2);
            
            send_to_server.println(str2);
        }
       
    }
    
}
