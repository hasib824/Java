public class GenericMethod
{
  public static void main(String args[])
  {
    Myclass<Integer> m=new Myclass<Integer>(45);
	Mymethod mym=new Mymethod();
	mym.show(m);
	
	Myclass<String> m1=new Myclass<String>("Hasibuzzaman");
	String me=m1.show();
	System.out.println(me);
  }
}
class Mymethod
{
   public void show(Myclass<? extends Number> m)
   { Integer m1=(Integer)m.ob;
     System.out.println("The value is : "+ (m1*m1));
   }
}

class Myclass<T>
{
    T ob;
	Myclass(T ob)
	{
	   this.ob=ob;
	}
	public T show()
   { 
     String s=(Integer)ob;
     System.out.println("Method under value is : "+ s);
	 return ob;
   }
}