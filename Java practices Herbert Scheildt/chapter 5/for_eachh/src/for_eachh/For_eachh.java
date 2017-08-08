
package for_eachh;

/**
 *
 * @author hasib
 */
public class For_eachh {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
                 int A[][]={{10,45,63,78,8,12,32},{91,19,73,37,43,61,82}};
          
         int sum=0;
         one : for(int X[]:A)
        {    
            two:for(int i:X)
          {
            System.out.print(" , "+ i);
            if(i==78) break two;
            if(i==37) break one;
          }
        System.out.println(" ");
        }    
    }
    
}
