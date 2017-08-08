package try_catch;

public class Try_catch_2 {

    public static void main(String[] args) {
        try {
            int a = 0;
            System.out.println("a = " + a);
            int b = 42 / a;
            int c[] = {1,5};
            
            c[42] = 99;
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index oob: " + e);
        }
        catch (ArithmeticException e) {
            System.out.println("Divide by 0: " + e);
        } 
        System.out.println("After try/catch blocks.");
    }
}
