// This code part will simulate How to get alla annotation Associated with a Method .
import java.lang.annotation.*;
import java.lang.reflect.*;


public class AllAnno
{
   public static void main(String args[])
   {
     Testy ob=new Testy();
	 ob.mymeth();
	 ob.mythy();
   }	   
}
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)  // Creating repeatable Annotation
@Repeatable(MyRepeatAble.class)
@interface Info
{
  String value();
  int age();
}

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyRepeatAble
{
  Info [] value();
}

@Retention(RetentionPolicy.RUNTIME)
@interface Versity
{
  String value();
}
 

@Info(value="merof",age=27)
class Tester
{  
   @Info(value="Hasibuzzaman Khan",age=26)
   @Info(value="Shakibuzzaman Khan",age=22)
   @Versity(value="State University Of Bangladesh")
   public void mymeth()
   { 
     Tester ob=new Tester();
	 try
	 {
	  Class<?> c=ob.getClass();
	  Method m=c.getMethod("mymeth");
    //  Annotation annos[]=m.getAnnotationsByType(Info.class);  // Taking the Repeated Annotations 
	  Annotation annos=m.getAnnotation(MyRepeatAble.class);
	  boolean ami=c.isAnnotationPresent(Info.class);
	  System.out.println("Annotation present : "+ ami);
	  System.out.println("Repeated Annotations : \n"+ annos);
	  /*for(Annotation a: annos)
	  {
         System.out.println(a);	  
	  }*/
	 }catch(Exception e)
	 {
		 
	 }
	 
	 
   }
}
class Testy extends Tester
{
   public void mythy()
   {
     Testy ob=new Testy();
	 try{
		 Class<?> c=ob.getClass();
		 Method m=c.getMethod("mymeth");
		 Info anno=m.getAnnotation(Info.class);
		 System.out.println("Inherited : \n value : "+ anno.value()+" Age : "+ anno.age());
	 }catch(Exception e)
	 {
	 }
   }
    
}