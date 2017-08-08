package stackdemo;

import java.util.*;

public class StackDemo {

    public static void main(String[] args) {
        // TODO code application logic here

        Stack<Integer> a = new Stack<>();
        for (int i = 1; i <= 10; i++) {
            a.push(i);
            a.add(i*10);

        }
      System.out.println(a);
        System.out.println("Size is : "+a.size());
        int l=a.size();
        for (int i = 1; i <=l ; i++) {
            if(i==1)
            {
                System.out.println("Stack size is : "+ a.size());
            }
            System.out.println("i is : "+i+ ", "+a.pop());

        }
        System.out.println("Broke");
    }

}
