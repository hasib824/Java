
package my_encapsulation;


public class My_encapsulation {

   
    public static void main(String[] args) {
        SavingsAccount sv = new SavingsAccount();
        System.out.println("Balance in savings account : "+sv.checkbalance());
    }
    
}

abstract class BankAccount
{   
    private double balance;
    abstract void withdraw(double amount);
   
    abstract void deposit(double amount);
    
    abstract double checkbalance();
    
    void printwithdrwasuccessfull()
    {
        System.out.println("Withdraw successfull");
    }
    
}

class SavingsAccount extends BankAccount
{
    private double balance = 5000;
    
    @Override
    void withdraw(double amount) {
       if(balance<amount)
       {
        balance -= amount;  
        printwithdrwasuccessfull();
       }
        
       else 
            System.out.println("Amount is less then withdraw amount");
    }
    void deposit(double amount) {
       balance +=amount;
    }
    double checkbalance() {
       return balance; 
    }
    
}
class MarchentAccount extends BankAccount
{
    private double balance = 1400;
    @Override
    void withdraw(double amount) {
         balance -= amount;
         printwithdrwasuccessfull();
    }   

    @Override
    void deposit(double amount) {
        
    }

    @Override
    double checkbalance() {
       return balance;
    }
}