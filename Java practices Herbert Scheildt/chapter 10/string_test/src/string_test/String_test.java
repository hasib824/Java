package string_test;

public class String_test {

    public static void main(String[] args) {
    String s="Hasib";
    String s1="H"+"asib";
    String s2=new String("Hasib");
    if(s==s1)
    {
        System.out.println("They are same");
    }
    s=s2;
    if(s==s2)
    {
       System.out.println("s and s2 are equals"); 
    }
    }
    
}
