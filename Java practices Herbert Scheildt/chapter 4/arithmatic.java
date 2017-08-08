
import java.math.BigDecimal;

class arithmatic
{
 public static void main(String args[])
 {
   int a=1+1;
   int b=a*3;
   int c=b/4;
   int d=c-a;
   boolean e=(10>9);
  
   System.out.println("\na = " + a);
   System.out.println("b = " + b);
   System.out.println("c = " + c);
   System.out.println("d = " + d);
   System.out.println("e = " + e);
   double ak=3.04;
   String me=Double.toString(ak);
   BigDecimal one=new BigDecimal(me);
   BigDecimal sum=one.add(one).add(one);
   System.out.println("\nThe double is : " + sum);
 }
}
