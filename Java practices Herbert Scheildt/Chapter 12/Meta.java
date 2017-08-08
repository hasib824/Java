import java.lang.annotation.*; // importing Java.util.annotation.RetentionPolicy;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno
{
  String str();
  int val();
}

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno1
{
  String str();
  int val();
}

public class Meta
{  
   
   public static void main(String args[])
   {
          Tester ob=new Tester();
	  
	  try
	  {
		  Class<?> c=ob.getClass();
		  Method m=c.getMethod("mymeth");
		  MyAnno anno=m.getAnnotation(MyAnno.class);
		  System.out.println("Name : "+anno.str()+ " Age : "+anno.val());
		  Method me=c.getMethod("mymeth");
		  MyAnno1 anno1=me.getAnnotation(MyAnno1.class);
		  System.out.println("Name : "+anno1.str()+ " Age : "+anno1.val());
	  }catch(Exception e)
	  {
	    System.out.println(e);
	  }
   }
}

class Tester
{
  @MyAnno(str="Hasibuzzaman Chowdhury", val=26)
  @MyAnno1(str="Maruf Chowdhury,", val=26)
   public static void mymeth()
   {

   }

}