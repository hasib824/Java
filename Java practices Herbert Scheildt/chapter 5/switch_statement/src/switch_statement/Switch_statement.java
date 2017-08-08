package switch_statement;

import java.util.Scanner;

public class Switch_statement {

    public static void main(String[] args) {
       Scanner seas=new Scanner(System.in);
       int se=seas.nextInt();
       switch(se)
        {
           case 1:
           case 2: 
           case 3 : System.out.println("Winter"); break;
           
           case 4:
           case 5: 
           case 6 : System.out.println("Spring");break;
           default : 
       }
       
       int i=100;
       int j=200;
       while(++i<--j)
       {
           
       }
       System.out.println("The Midpoint of I is : "+ i +" "+ j);
    }
    
}
