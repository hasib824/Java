public class Sync
{
	public static void main(String args[])
	{
	     Account a=new Account();
		 Withdrawer wi=new Withdrawer(a,"Wihdrawing",12000);
		 Depositor de=new Depositor(a,"Depositor",3000);
		 wi.t.start();
		 de.t.start();
		 try
		 {
			 wi.t.join();
			 de.t.join();
		 }catch(Exception  e)
		 {
			 
		 }
		 System.out.println("Exiting : "+ Thread.currentThread().getName());
	}
}

class Account
{
     int balance=10000;
	 boolean a=true;
	 synchronized void withdraw(int amnt)
	 {   System.out.println("Inside the Withdraw");
		 if(amnt>10000)
		 {
			a=false;
		 }
		 while(!a)
		 {
		   try
		   {   System.out.println("Not sufficient balance");
			   wait();
		  }catch(Exception e)
		  {
		   
		   }
		 }
		 balance=balance-amnt;
		 System.out.println("Withdraw Successfull, currnet balance is : "+ balance);
	 }
	 synchronized void deposit(int amnt)
	 {     
	       System.out.println("Inside the Deposit");
		   balance=balance+amnt;
		   a=true;
		   notify();
		   System.out.println("Successfully deposited, balance is : "+balance);
	 }
}

class Withdrawer implements Runnable //extends Thread
{   Account a;
    String s;
	int amnt;
	Thread t;
    Withdrawer(Account a,String s,int amnt)
	{    
	    this.a=a;
		this.s=s;
		this.amnt=amnt;
		t= new Thread(this,this.s);
		//new Thread(this,this.s);
		//start();
	}
	public void run()
	{
	   a.withdraw(amnt);
	}
}
class Depositor implements Runnable//extends Thread
{
    Account a;
    String s;
	int amnt;
	Thread t;
    Depositor(Account a,String s,int amnt)
	{    
	    this.a=a;
		this.s=s;
		this.amnt=amnt;
		t= new Thread(this,this.s);
		//new Thread(this,this.s);
		//start();
	}
	public void run()
	{
	   a.deposit(amnt);
	}
}

