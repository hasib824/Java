public class wait1
{
     public static void main(String args[])
	 {
		 Q q=new Q();
		 Producer p=new Producer(q,"Producer");
		 Consumer st=new Consumer(q,"Consumer");
	 }
}

class Q{
  int n;
  boolean hasa=false;
 synchronized int get()
  {  
     
        
	/*    try
		{ 
		   wait();
		}catch(Exception e)
		{
			 System.out.println(e);
		} 
		*/
	  System.out.println("Get majhkhan diya: " + n);
	  hasa=false;
	  notify();
	  return n;
  }
  
synchronized void put(int n)
  {  
      System.out.println("Wait er age : ");
      this.n=n;

	 {
	    try
		{wait();} catch(Exception e){}
	 }
	 System.out.println("Put wait er pore: "+n);
	 hasa=true;
	 //notify();	 
  }
 
}

class Producer implements Runnable
{  
   Q a;
   Thread t;
   String s1;
   Producer(Q a,String s)
   {  
      s1=s;
      this.a=a;
	  t=new Thread(this,s1);
	  t.start();
   }
   public void run()
   {
	   for(int i=1;i<=10;i++)
	   {
	      a.put(i);
	   }
   }
}

class Consumer implements Runnable
{  
   Q a;
   Thread t;
   String s1;
   Consumer(Q a,String s)
   {  
      s1=s;
      this.a=a;
	  t=new Thread(this,s1);
	  t.start();
   }
   public void run()
   {
	   for(int i=1;i<=10;i++)
	   {
	      a.get();
	   }
   }
}