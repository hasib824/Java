package string_arrays;

import java.util.Scanner;


public class String_arrays {
    public static void main(String[] args) {
       String_array ob= new String_array();
       ob.input();
    }    
}

class String_array
{
    String a[]=new String[5];
    void input()
    {
     
      Scanner in = new Scanner(System.in);
      for(int i=0;i<=4;i++)
      {
        System.out.println("Please enter a string : ");   
        a[i]=in.nextLine();
      }
      for(int i=0;i<=4;i++)
      {
        System.out.println(a[i]);   
      }
    }
}