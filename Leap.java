/* Q38. Write a Java program to check whether a given year is a leap year or not.
 Input : Year = 2024
 Output : Leap Year
 Explanation : A leap year is divisible by 4 and follows leap year rules.
 */
 
 import java.util.*;
 class Leap{
	 public static void main(String args[])
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the leap year ");
		 int a=sc.nextInt();
		 
		 if ((a%4==0 && a%100!=0)|| (a%400==0))
		 {
			 System.out.println("It is leap year");
		 }
		 else
			 System.out.println("It is not leap year");
	 }
 }