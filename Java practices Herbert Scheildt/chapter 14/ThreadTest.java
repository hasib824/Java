public class ThreadTest
{
   public static void main(String args[])
   {
      Mythread abc=new Mythread();
      Myclass<?> a=new Myclass<Mythread>(abc);
   }
}

class Myclass<T extends Thread>
{
   T as;
   Myclass(T as)
   {
     //this.as=as;
	 as.start();
   }
}

class Mythread extends Thread
{
    public void run()
	{
	  for(int i=0;i<=10;i++)
	  {
	    System.out.println("Value : "+ i);
		try
		{ 
		Thread.sleep(1000);
		}
		catch(Exception e)
		{
		  
		}
		
	  }
	}
}