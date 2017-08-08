import java.lang.annotation.*; // importing Java.util.annotation.RetentionPolicy;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno
{
  String str();
  int val();
}

public class Reten_tion
{  @MyAnno(str="Hasibuzzaman Chowdhury", val=26)
   public static void mymeth()
   {
      Reten_tion ob=new Reten_tion();
	  
	  try
	  {
		  Class<?> c=ob.getClass();
		  Method m=c.getMethod("mymeth");
		  MyAnno anno=m.getAnnotation(Reten_tion.class);
		  System.out.println("Name : "+anno.str()+ " Age : "+anno.val());
	  }catch(Exception e)
	  {
	    System.out.println(e);
	  }
   }
   
   public static void main(String args[])
   {
     mymeth();
   }
}