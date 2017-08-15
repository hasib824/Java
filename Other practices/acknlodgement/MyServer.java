
package acknlodgement;

import java.io.*;
import java.net.*;
import java.util.*;


public class MyServer {
    public static void main(String ...args) throws Exception{
        System.out.println("**********I am Server**********");
        
        ServerSocket svr= new ServerSocket(1545);
          
        Socket skt = svr.accept();
        
        Scanner get_from_client = new Scanner(skt.getInputStream());
        
        PrintStream  send_to_client = new PrintStream(skt.getOutputStream());
        
        while(true)
        {
            String string = get_from_client.nextLine();
            
            send_to_client.println(string);
            
           String string1 = get_from_client.nextLine();
            
            System.out.println("Client Received : "+ string1);
            
        }
        
    }
    
}
