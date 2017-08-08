public class Test
{   
  public static void main(String[] args)
  {
      Mygen<Integer> l=new Mygen<Integer>(10);
	  l.showType();
	  System.out.println("The value is : " + l.showValue());
	  
	  Mygen<String> l1=new Mygen<String>("Hasibuzzaman Chowdhury");
	  l1.showType();
	  System.out.println("The value is : " + l1.showValue());
	  
	  Mygen<Double> l2=new Mygen<Double>(10.45);
	  l2.showType();
	  System.out.println("The value is : " + l2.showValue());
  }
}

class Mygen<T>
{
    T ob;
	Mygen(T ob)
	{
	  this.ob=ob;
	}
	public void showType()
	{
	   System.out.println("The type is :"+ ob.getClass().getName());
	}
	
	public T showValue()
	{
	   return ob;
	}
}