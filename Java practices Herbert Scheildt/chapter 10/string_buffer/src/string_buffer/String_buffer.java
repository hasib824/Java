package string_buffer;


public class String_buffer {

   
    public static void main(String[] args) {
        String S="Hasibuzzaman";
        String s2=S.concat(" Chowdhury");
        System.out.println("this concated and placed into new object : "+s2);
        
        StringBuffer as=new StringBuffer("Hasibuzzaman");
        as.append("Khan Chowdhury");
        System.out.println("This is appended \' hasibuzzaman: "+as);
        boolean a=true;
        if(a==true)
        {
            System.out.println(a);
        }
    }
    
}
