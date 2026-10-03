/* Q57. Write a java program to determine bonus based on performance rating.
 Input : Rating = 9
 Output : 15% Bonus
 Explanation : Rating greater than 8 gets 15% bonus. */
 import java.util.*;
 class Rating{
	 public static void main(String args[])
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the Rating");
		 int a=sc.nextInt();
		 if(a>=8)
		 {
			 System.out.println("15%bonus");
		 }else
		 {
			 System.out.println("14%bonus");
		 }
	 }
 }