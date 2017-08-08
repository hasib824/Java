public class MainThread{
    public static void main(String args[])
	{
	    Thread t=Thread.currentThread();
		System.out.println("Current Thread : "+ t);
		t.setName("MyThread");
		System.out.println("After name change t is : "+t);
		System.out.println("The name of the Thread is : "+t.getName());
		
		try
		{
		   for(int i=10;i>0;i--)
		   {
		      t.sleep(2000);
			  //Thread.sleep(500);
			  System.out.println(i+"\n");
		   }
		}
		catch(InterruptedException e)
		{
		   System.out.println("Exception");
		}
	}
	
}