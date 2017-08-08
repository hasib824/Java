package testing;

import java.lang.annotation.*;
import java.lang.reflect.*;
// An annotation type declaration.

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno
{
    String str();
    int val();
}

class Meta {
// Annotate a method.
    @MyAnno(str="Hasibuzzaman Chowdhury",val=100)
    public static void mainy() {
        Meta ob=new Meta();
        try {
          Class<?> c=ob.getClass();
          Method me=c.getMethod("mainy");
          MyAnno as=me.getAnnotation(MyAnno.class);
          System.out.println("Name : "+ as.str()+ " Age : "+ as.val());
        } catch (Exception e) {
        }
        
     }
    public static void main(String args[])
    {
        mainy();
    }
}
