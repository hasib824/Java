

public class MyProcess{
   
   public static void main(String ...args)
   {
     Runtime rn = Runtime.getRuntime();
	 
	 
	 System.out.println("TotalMemory : "+ rn.totalMemory()+ " mb");
	 System.out.println("FreeMemory : " +  rn.freeMemory() +" mb");
	 rn.gc();
	 System.out.println("FreeMemory : " +  rn.freeMemory() +" mb");
	 
	 Integer someints[] = new Integer[1000];
	 for(int i=0; i<1000; i++)
	 {
		 someints[i] = new Integer(i);
	 }	 	 
	 System.out.println("Now\nTotalMemory : "+ rn.totalMemory() + " mb");
	 System.out.println("FreeMemory : " +  rn.freeMemory()+" mb");
	 
	 	 for(int i=0; i<1000; i++)
	 {
		 someints[i] = null;
	 }	
	 rn.gc();
	 System.out.println("After\nFreeMemory : " +  rn.freeMemory()+" mb");
	 
	 try
	 {
	   Process p= rn.exec("calc");
	   ProcessBuilder pb = new ProcessBuilder("notepad","hello");
	   pb.start();
	   
	 }catch(Exception e)
	 {
	    
	 }
	 
	 
	 
	 System.out.println("Hello Hasib");
	 
	 
   }

}