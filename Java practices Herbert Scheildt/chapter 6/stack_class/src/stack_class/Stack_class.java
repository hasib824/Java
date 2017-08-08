
package stack_class;

import java.util.Scanner;

public class Stack_class {

    public static void main(String[] args) {
        Stack myStack=new Stack();
        int choice;
        int value;
        do
        {
            System.out.println("\nWhat operation do you want : \n1.Push ? \n2.Pop ? \n3.Print ? \n4.Exit ? ");
            Scanner in = new Scanner(System.in);
            choice=in.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Please Enter a value : "); value=in.nextInt();myStack.push(value); break;
                case 2:
                    System.out.println("The popped value is : "+myStack.pop()); break;
                case 3: 
                    for(int i=0;i<=myStack.size;i++)
                    {
                    System.out.print(myStack.datas[i]+", "); 
                    } break;
                case 4:
                    System.out.println("Thanks for stying with us "); break;
                default :
                    System.out.println("Please press the right key ");
            }
          
        }while(choice!=4);
    }
    
}
class Stack 
{   
    int datas[]= new int[100];
    int value=0;
    int size=-1;
    void push(int x)
    { 
        datas[++size]=x;
    }
    int pop()
    {   int re=0;
        if(size<0){System.out.println("The Stack is empty !!");}
        else re=datas[size--];
        return re;
    }
}