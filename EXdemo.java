import java.util.*;
class Exdemo{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
		System.out.println("Enter the number ");
		int a=x.nextInt();
		int b=x.nextInt();
		
		try{
			int c=a/b;
			System.out.println("Result is "+c);
			
		}
		catch(ArithmeticException e){
			System.out.println("Error is "+e);
			
		}
		System.out.println("Logic 1");
		System.out.println("Logic 2	");
		System.out.println("Logic 3");
	}
}