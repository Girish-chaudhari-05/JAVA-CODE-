//1. Write a program to find maximum between two numbers.
import java.util.*;
class Maxdemo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		if(a>b)
		{
			System.out.println("larger number"+a);
		}else
		{
			System.out.println("larger number"+b);
		}

	}
}