package mergesort;


public class MergeSort {

   
    public static void main(String[] args) {
       int a[] = {10,15,47,87,45};
         
              System.out.println("Inside Main : ");
        
       for(int i=0;i<5;i++)
        {
            a[i] = a[i];
            System.out.println(a[i]);
            
        }
       
       Tester.manipulate(a);     
       System.out.println("Inside Main again : ");
        
       for(int i=0;i<5;i++)
        {
            a[i] = a[i];
            System.out.println(a[i]);
            
        }
       int c = 5;
       Tester.inter(c);
       
        System.out.println(" a is : "+ c);
       
    }
    
}


class Tester
{
   static  void  manipulate(int a[])
    {   System.out.println("Inside Manipulate : "); 
        for(int i=0;i<5;i++)
        {
            a[i] = a[i]+5;
            System.out.println(a[i]);
            
        }
    }
   
   static void inter(int a)
   {   a+=5;
       System.out.println("inside inter : "+ a);
   }
}