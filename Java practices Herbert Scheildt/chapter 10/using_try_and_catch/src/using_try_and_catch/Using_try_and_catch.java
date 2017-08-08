package using_try_and_catch;

public class Using_try_and_catch {

    public static void main(String[] args) {
        MyEx as = new MyEx();
        as.meth();
    }

}

// First Example 







 // first Example 
class MyEx {

    int a = 10, b = 0;

    void meth() {
        try {
            System.out.println("Excpetion is happening");
            System.err.println("Excpetion is happening");
            int res = a / b;

        } catch (Exception e) {
            System.out.println(e);
        }
         System.out.println("This is printable");
    }
}
  // End of First Example 
