public class Suspe_nd
{
   public static void main(String args[])
   {
      Tester a=new Tester("One");
	  Thread c=Thread.currentThread();
	  System.out.println("Thread one State : "+ a.t.getState());
	  a.t.start();
      Tester b=new Tester("Two");
	  //System.out.println("Thread one State : "+ a.t.getState());
	  try
	  {
	  //a.t.start();
	 // b.t.start();
	 //Thread.sleep(1);
	  a.mysuspend();
	  //System.out.println("Thread one State : "+ a.t.getState());
	  System.out.println("Suspending Thread one ");
	  Thread.sleep(1000);
	//  System.out.println("main Thread State : "+ c.getState());
	// System.out.println("Thread one State : "+ a.t.getState());
	  System.out.println("Resuming Thread one ");
	  a.myresume();
	//  System.out.println("Myresume er pore : "+ a.t.getState());
	   
	  Thread.sleep(1000);
	  b.mysuspend();
	  System.out.println("Suspending Thread two ");
	  Thread.sleep(1000);
	//  System.out.println("Thread one State : "+ a.t.getState());
	  System.out.println("Resuming Thread two ");
	  b.myresume(); 
	  }catch(Exception e)
	  {
	  
	  }
	  
      try {
		    System.out.println("Thread" + a.t.getName() +" : "+ a.t.isAlive());
			//System.out.println("Thread" + b.t.getName() +" : "+ b.t.isAlive());
			System.out.println("Waiting for threads to finish.");
			a.t.join();
			//b.t.join();
			System.out.println("Thread" + a.t.getName() +" : "+ a.t.isAlive());
			//System.out.println("Thread" + b.t.getName() +" : "+ b.t.isAlive());
			System.out.println("Thread one State : "+ a.t.getState());
		} catch (InterruptedException e) {
		System.out.println("Main thread Interrupted");
		} 
}
}

class Tester implements Runnable
{   String s;
    boolean mysus=true;
    Thread t;
	Tester(String s)
	{
	     this.s=s;
		 t=new Thread(this,this.s);
		 //t.start();
	}
	
	public void run()
	{  
   
     synchronized(this)
	{
		try{
			for(int i=1;i<15;i++)
		 {
		   System.out.println(s + " : "+ i);
		  // Thread.sleep(100);

		      while(!mysus)
		     {       System.out.println("Before Wait: "+ t.getState());
					 wait();	
					//System.out.println("After Wait: "+ t.getState());
			 }
		   }
		   
		   
		}catch(Exception e)
	  { 	
	    System.out.println(e);
	  }
	  System.out.println(s+" : " + "Exiting");
	}
	}
	
	synchronized void mysuspend()
	{  
	   System.out.println("Inside Suspend : "+ t.getState());
	   mysus=false;
	}
	synchronized void myresume()
	{
	  System.out.println("Inside Myresume: 1"+ t.getState());
	  System.out.println("Inside Myresume: 2"+ t.getState());
	   mysus=true;
	   System.out.println("Inside Myresume: 3"+ t.getState());
	   System.out.println("Inside Myresume: 4"+ t.getState());
	   System.out.println("Inside Myresume: 5"+ t.getState());
	   notify();
	   System.out.println("Inside Myresume: 6"+ t.getState());
	}
}
