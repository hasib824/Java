class bitwise
{
    public static void main(String args[])
      {
	    int has=186;
		int he=has>>4;
		System.out.println("The result is : " + he);
	    has=-10;
		has>>>=2;
		System.out.println("The -10 becomes : "+ has);
		has=10;
		has>>>=2;
		System.out.println("The 10 becomes : "+ has);
		int ak=0xf1;
		//ak=(ak>>>2);
		System.out.println("Th result is : "+ ak);
	  }	

}