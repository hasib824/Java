
package casting.truncation;

public class CastingTruncation {

    
    public static void main(String[] args) {
        
        
        byte by;
        int  in=456;
        double doub=255.56;
        
        by=(byte) in;
        System.out.println("integer & Byte "+"  "+ in +" "+ by);
        
        in = (int) doub;
        System.out.println("integer & Double "+ in +" "+ doub);
        
        by=(byte) doub;
        System.out.println("Byte    & Double "+ by +" "+ doub); 
    }
    
}