package javaapplication2;
import javaapplication2.amra.*;

import java.util.Random;

public class JavaApplication2 {

    public static void main(String[] args) {
        Rand ra=new Rand();
        Test te =new Test();
        
        B asd= new B();
        System.out.println(B.gh);
       // te.answer(ra.ask());
    }

}

interface Constants {

    int No = 0;
    int Yes = 1;
    int Maybe = 2;
    int later = 3;
    int soon = 4;
    int never = 5;
}

class Rand implements Constants {

    Random as = new Random();

    int ask() {
        int a = (int) (100 * as.nextDouble());
        if (a < 30) {
            return No;
        } else if (a < 60) {
            return Yes;
        }
        if (a < 75) {
            return later;
        }
        if (a < 98) {
            return soon;
        } else {
            return never;
        }
    }
}
class Test implements Constants
{
     void answer(int res)
     {
          switch(res)
          {
              case No: System.out.println("No");
              case Yes: System.out.println("Yes");
              case later: System.out.println("later");
              case soon: System.out.println("soon");
              case never: System.out.println("never");
          }
     }
}
