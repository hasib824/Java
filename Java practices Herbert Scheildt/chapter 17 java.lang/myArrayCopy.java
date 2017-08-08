public class myArrayCopy
{
   public static void main(String ...args)
   {
       int a[] = {1,2,3,4,5,6,7,8,9,10};
       int b[] = new int[10];
       System.arraycopy(a,0,b,0,10);

       for(int i: b)
	   {
         System.out.println(i);
	   }	

      System.err.println(System.getProperty("user.name"));   
      System.err.println(System.currentTimeMillis());   
   }
}