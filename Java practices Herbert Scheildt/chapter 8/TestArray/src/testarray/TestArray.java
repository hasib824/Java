package testarray;


public class TestArray {


    public static void main(String[] args) {
         int a[]=new int[10];
         System.out.println("The length of A is : "+ a.length);
         int b[]=new int[15];
         System.out.println("The length of B is : "+ b.length);
         a=b;
         System.out.println("The length of a is : "+ a.length);
    }    
}


