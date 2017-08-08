public class Test{
   public static void main(String args[])
   {
     A as=new A(5,10);
	 System.out.println("The 1st object : ");
	 as.ant();
	 A ad=new A(10,20);
	 System.out.println("The 2nd object : ");
	 ad.ant();
	 System.out.println("The 1st object again: ");
	 as.ant();
	 
	}
}

class A
{
	static int a, b;
	 A(int x,int y)
	 {
		 a=x;
		 b=y;
	 }
	 public static void ant()
	 {
		 System.out.println("The result is : "+ (a+b));
	 }
}