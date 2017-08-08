public class MultipleThread
{
    public static void main(String args[])
	{
	   NewThread fi=new NewThread("one");
	   fi.t.start();
	   NewThread as=new NewThread("Two");
	   as.t.start(); // Starting the First Thread From here
	   NewThread ad=new NewThread("Three");
	   ad.t.start();  // Starting the First Thread From here
	   System.out.println("Thread One is alive: "+ fi.t.isAlive());
	   System.out.println("Thread two is alive: "+ as.t.isAlive());
	   System.out.println("Thread three is alive: "+ ad.t.isAlive());

	  try
	   {
	     //for(int j=5;j>0;j--)
		// {
			 System.out.println("Parent Thread : " + Thread.currentThread());
			 System.out.println("Join er age");
			 fi.t.join();
			 //as.t.join();
			// ad.t.join();
			 System.out.println("Join er pore");
			// ad.t.start();  // Starting the Third Thread From Here 
			// Thread.sleep(4000);
		 //}
		 System.out.println("Thread One is alive: "+ fi.t.isAlive());
	   System.out.println("Thread two is alive: "+ as.t.isAlive());
	   System.out.println("Thread three is alive: "+ ad.t.isAlive());

		 System.out.println("Exiting main Thread : ");
	  }
	  catch(Exception e)
		  {
		  
		  }
	}
}

class NewThread implements Runnable
{   Thread t;
    NewThread(String s)
	{
	   t=new Thread(this, s);
	   System.out.println("Child Thread is : "+ t);
	  // t.start();   // Starting the Thread From Here 
	}
	public void run()
	{
	     // try
		 // {
		      for(int i=5;i>0;i--)
			  {
			     // Thread.sleep(500);
				  System.out.println(Thread.currentThread().getName() + " : "+test());
			  }
			  System.out.println("Exiting From : "+ Thread.currentThread().getName());
		//  }
		//  catch(InterruptedException e)
		//  {
		  
		 // }
	}
	
	int test()
	{
	  return 15;
	}
	

}