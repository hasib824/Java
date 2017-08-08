package string_methods;

public class String_methods {

    public static void main(String[] args) {
      Mystrings as=new Mystrings();
      as.test();
    }
}

class Mystrings
{
    String a="Hi Hasib";
    String b="Chowdhury";
    String c="Hi Hasib";
    void test()
    {
        System.out.println("a == b is "+ a.equals(b));  
        System.out.println("a == c is "+ a.equals(c));  
        System.out.println("4th character at \"Chowdhury\" is : "+ b.charAt(4));  
    }  
}