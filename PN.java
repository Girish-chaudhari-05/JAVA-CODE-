import java.util.*;
class PN
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		if(a<0)
		{
			System.out.println("Negative number");
			
		}
		if(a>0)
		{
			System.out.println("postivie number");
		}
		else
		{
			System.out.println("zeero number");
		}
	}
}