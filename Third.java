/*
Q29.Write a Java program to find quotient and remainder using arithmetic operators.
Input	:  Dividend = 20	Divisor = 3
Output   :  Quotient = 6	Remainder = 2
Explanation	:  Division and modulus are used.

*/
import java.util.*;
class Third
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Dividend");
		int div=sc.nextInt();
		System.out.println("Enter the Divisor");
		int divi=sc.nextInt();
		int a=div/divi;
		int b=div%divi;
		System.out.println(" Qutient  is"+a);
		System.out.println("remainder is "+b);
	}
}  

