
package split;


public class Split {

  
    public static void main(String[] args) {
        // TODO code application logic here
        
        String s= "Narsingdi, Dhaka";
        String[] split = s.split(",");
        System.out.println("City"+split[0]+ " Country : "+split[1]);
    }
    
}
