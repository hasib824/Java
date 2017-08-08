public class Boxing
{
   public static void main(String args[])
   {  
     Box a=new Box();
	 a.meth1(10);
	 Integer ab=15;
	 a.meth2(ab);
	 Integer in1=25;
	 Integer in2=50;
	 int am=(in2/in1)*2;
	 in2++;
	 in2++;
	 in1=in2/2;
     System.out.println("Innteger A rupantor : "+ am);
     System.out.println("Object A rupantor : "+ in1);
	 if(am==in1)
	 {
	   System.out.println("Yes they are shoman");
	 }
	 // checking Double if Compatible with Integer 
	 
	 Double as=9.7;
	 as+=am;
	 System.out.println("Double er sathe Jog kore : " + as);
   }
}

class Box
{
  int a,b;
  Box()
  {
    a=10;
	b=15;
  }
  public void meth1(Integer a)
  {  
     int c=a;
	 System.out.println("Auto : "+ c);
  }
     public void meth2(int a)
  {  
     //Int c=a;
	 System.out.println("Auto 2: "+ a);
  }
 }