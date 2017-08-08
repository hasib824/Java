package inherit;

public class Inherit {

   
    public static void main(String[] args) {
       A asd=new A();
        System.out.println(asd);
    }
    
}
class A
{
   int ma=10;
  protected int met()
   {
       return 10;
   }
  public String toString()
  {
      return "Keda re";
  }
}
class B extends A
{
   public int met()
    {
        return 15;
    }
}
