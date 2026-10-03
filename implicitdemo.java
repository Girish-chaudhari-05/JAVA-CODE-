class implicitdemo{
	public static void main(String args[])
	{
		int a=100;
		long b=a; //implicit 
		
		System.out.println("Implicit type casting "+b);
		
		long m=200; //explicit typecasting
		int n=(int)m;
		 System.out.println("Explicit typecasting"+n);
 		
	}
}