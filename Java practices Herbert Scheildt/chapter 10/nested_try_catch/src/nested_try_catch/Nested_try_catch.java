package nested_try_catch;

public class Nested_try_catch {

    public static void main(String[] args) {
         NestedTryManually va=new NestedTryManually();
        // va.test(0);
         DynamicTry tr=new DynamicTry();
         try {
            int a=0;
            int b=5/a;
            DynamicTry.test(4);
          //  tr.test(3);
        } catch (Exception e) {
             System.out.println("Outer Try : "+e);
        }
    }

}
// Nested try using one try and calling a method that is also in another try block 

class DynamicTry
{
   static int a;
   static void test(int b)
    {   int g[]=new int [2];
        
        try {
            g[2]=5;
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}




// Nested using manually with 2 try block 
class NestedTryManually {
  
    int a = 0;
   
    void test(int a) {
        try {
            this.a=a;
            int c = 5 / a;
            // Inner try 
            System.out.println("Ashe nai ");
            try {
                int f[] = new int[5];
                f[6] = 99;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Matha gese , Arrayer size dekhso ? ");
            }
            // End of inner try 
        } catch (ArithmeticException e) {
            System.out.println(e);
        } // end of outer try 
    }
}
