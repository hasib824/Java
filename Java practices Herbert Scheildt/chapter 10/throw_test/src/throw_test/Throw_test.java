package throw_test;

import java.io.IOException;

public class Throw_test {

    public static void main(String[] args) {
        Testthrow as = new Testthrow();
        try {
            as.myMethod();
        } catch (ArithmeticException e) {
            System.err.println("keno ki hoise ? ");
        }

    }

}

class Testthrow {

    void myMethod() {
        try {
            throw new ArithmeticException("kita re bahe");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
