package mystringbuffer;


public class MyStringBuffer {

  
    public static void main(String[] args) {
       
        StringBuffer stb= new StringBuffer("Hasibuzzaman Chowdhury");
        
        System.out.println("Before -> Length : "+ stb.length()+ "\tCapacity : "+stb.capacity());
        
        stb.setLength(5);
        
        System.out.println("After -> Length : "+ stb.length()+ "\tCapacity : "+stb.capacity());
        
        stb.trimToSize();
        
        System.out.println("After -> Length : "+ stb.length()+ "\tCapacity : "+stb.capacity());
        
        
        
        
        
        
    }
    
}
