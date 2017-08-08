public class waitta
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
     
      while(!hasa)
	  {
	    try
		{ 
		   wait();
		}catch(Exception e)
		{
			 System.out.println(e);
		}
	  }
	  System.out.println("Get : " + n);
	  hasa=false;
	  notify();*/
	  return n;
  }
  
synchronized void put(int n)
  {  this.n=n;
     while(hasa)
	 {
	    try
		{wait();} catch(Exception e){}
	 }
	 System.out.println("Put : "+n);
	 hasa=true;
	 notify();
   	 System.out.println("Put Method Enter the Monitor");
	 try
	 {
		 wait();
	 }
	 catch(Exception e)
	 { 
	   
	 }
	 System.out.println("Put Method End");
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