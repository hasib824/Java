public class FirstEnum
{
   public static void main(String args[])
   {
      Mango am=Mango.Lengra;
      if(am==Mango.Lengra)
	  {
	     System.out.println("Akhon Bazar e ase : "+ am);
	  }
	  Mango amgolo[] = Mango.values();
       System.out.println("Bazar akhon am ase : ");
	   for(Mango ami : amgolo)
	   {
	     System.out.println(ami);
	   }
      am=Mango.valueOf("Fojli");
     System.out.println("Value of : "+ am);	  
   }
}

enum Mango{
   Lengra, Himshagor, Fojli,Gopalbogh, Khirsapat,Mohanbhog;
}

0