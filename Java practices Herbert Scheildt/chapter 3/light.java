public class light
{
	
	public static void main(String args[])
	{
		
		int lightspeed=186000;
		int days=1000;
		long seconds=60*60*24*days;
		
		long distance = lightspeed*seconds;
		System.out.println("\nIn "+ days + " days light goes " + distance + " miles");
	}
}