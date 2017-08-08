
package thiskeyward;


public class ThisKeyward {


    public static void main(String[] args) {
       Box mybox=new Box();
        System.out.println("The result of local variables are : "+mybox.res1(2, 5, 5, 4, 5, 5));
        System.out.println("The result of instance variables are : "+mybox.mul());
        
    }
    
}
// Creating a class 
class Box
{
     int a, b,c; // Declarting instance variable 
     int res1(int x,int y,int z,int m,int n,int o)
     {   int a,b,c; // Creating local variable with the same name as Instance variable 
         a=x; b=y; c=z;  // intializing local variables (They are distinct from instance variables)
         this.a=m;  // intializing instance variables
         this.b=n;
         this.c=o;
         return a*b*c;  //
     }
     int mul()
             {
              return a*b*c;   // returning the result of instance variables 
             }
}
