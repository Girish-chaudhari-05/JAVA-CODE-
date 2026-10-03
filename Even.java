
/*
Q31. Write a Java program to check whether a given number is even or odd.
 Input : Number = 12
 Output : Even
 Explanation : A number divisible by 2 is even; otherwise, it is odd.

*/
import java.util.*;
class Even{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int a=sc.nextInt();
		if(a%2==0)
		{
			System.out.println("The number is even "+a);
			
		}
		else
			System.out.println("The number is not even"+a);
	}
}