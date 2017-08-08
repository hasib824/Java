package throw_throws;
import java.util.Scanner;

/**
 *
 * @author hasho
 */
public class Throw_throws {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
       Scanner a=new Scanner(System.in);
       System.out.println("Please Enter your age"); 
       int ag=a.nextInt();
       Signup form=new Signup();
       try
       {
           form.test(ag);
       }catch(MyException e)
       {
           System.out.println(e);
       }
    }
    
}
class Signup
{
    int age;
    void test(int a) throws MyException
    {
        age=a;
        if(age<18)
        {
           throw new MyException("You are a child. Go to your parents");  
        }
        else
        {
            System.out.println("Congratulations");
        }
    }
}

class MyException extends Exception
{   String s1;
    public MyException(String s)
    {
        s1=s;
    }
    public String toString()
    {
        return s1;
    }
}
