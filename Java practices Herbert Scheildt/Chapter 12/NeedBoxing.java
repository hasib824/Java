public class NeedBoxing
{
   public static void main(String args[])
   {
       String as="123";
	   int a=Integer.parseInt(as);
	   System.out.println(a+7);
	   String s1="Value : ";
	   s1+=Integer.toString(a);
	   System.out.println(s1);
   }
}
