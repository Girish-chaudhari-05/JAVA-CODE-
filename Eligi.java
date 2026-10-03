/*
Q53. Write a java program to check eligibility based on percentage and income.
 Input:
 Percentage = 78
 Income = 180000
 Output : Eligible
 Explanation : Percentage ≥ 75 and income < 200000.

*/

import java.util.*;
class  Eligi
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the percentage");
		int per=sc.nextInt();
		
		System.out.println("Enter the Income");
		int income=sc.nextInt();
		
		if(per>=75 && income<200000)
		{
			System.out.println("Eligible");
		}else
			System.out.println("Not eligible");
	}
}