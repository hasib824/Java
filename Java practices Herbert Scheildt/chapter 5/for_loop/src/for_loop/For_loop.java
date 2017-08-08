package for_loop;

public class For_loop {

    public static void main(String[] args) {
        int i,j;
        
         for(i=1,j=10; i<10 || j>10; i++,j--)
         {
             System.out.println("The value of I is : "+ i +" and j is : "+ j);
         }
         boolean done = false;
         boolean done1=!done;
         System.out.println("The value is : "+ done1);
         if(!done)
         {
             System.out.println("This is right");
         }
         else 
         {
             System.out.println("This is not right");
         }
          
         int ij=0;
         for(;;)
         {
             System.out.println(i++);
             if(i==5) break;
         }
    } 
    
}
