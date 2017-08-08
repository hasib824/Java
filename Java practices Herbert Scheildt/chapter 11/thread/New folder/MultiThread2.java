public class MultiThread2{
	public static void main(String args[])
	{
		Mythread as=new Mythread();
		as.start();
		try{
		  for(int i=5;i>0;i--)
		  {
		    System.out.println("Parent Thread: "+ i);
			Thread.sleep(1000);
		  }
		}catch(InterruptedException e)
	   {
		   
	   }
	}
}

class Mythread extends Thread
{
    Mythread()
	{
		//super("MyThread");
		System.out.println("The thread is : "+ this);
    }
     public void run()
	 {
	   try
	  {
		   for(int i=5;i>0;i--)
		   {   
	           System.out.println("Child Thread : "+ i);
			  Thread.sleep(700);
		   }
	   }catch(InterruptedException e)
	   {
		   
	  }
	 }		 
}