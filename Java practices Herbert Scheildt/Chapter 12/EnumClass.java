import java.lang.EnumSet;+




public class EnumClass
{
  public static void main(String args[])
  {
    Mango am=Mango.Himshagor;
	System.out.println(am);
	for(Mango ami : Mango.values())
	{
	System.out.println(ami+ " Paowa jay " +ami.des + " R Price :"+ ami.price);
	}
	System.out.println("\n");
	for(Mango ln : Mango.values())
	{
    	System.out.println("Position of "+ ln + " is "+ ln.ordinal());
	}
	System.out.println("Three Methods Checking\n");
	
	Mango amar=Mango.Himshagor;
	Mango tomar=Mango.Gopalbogh;
	Mango Mainsher=Mango.Himshagor;
	if(amar.compareTo(tomar)<0)
	{
	  System.out.println("Himshagor choto");
	}
	
	if(amar.compareTo(Mango.Himshagor)==0)
	{
	  System.out.println("Amar R Mainsher shoman e");
	}
	
	if(amar==Apple.Himshagor)
	{
	   System.out.println("Tara shoman");
	}
	else
	{
	  System.out.println("Tara Shoman na");
	}
	
  }
}

enum Apple
{
 Himshagor;
}
enum Mango
{
   Lengra/* On the Second Overloaded Constructor*/, Himshagor("Kishoreganj",70), 
   Fojli("Narshingdi",60),Gopalbogh("Vhairab",40), Khirsapat("Sylhet",35),Mohanbhog("Munshigonj",30);
  // Lengra, Himshagor, Fojli,Gopalbogh, Khirsapat,Mohanbhog;
   public int price ;
   public String des;
   Mango(String des,int p)
   {
	 this.des=des;
     price=p;
   }
   Mango() // Constructor Overloading
   {
     price=-1;
   }
  }