/* Q42. Write a Java program to check whether a person is eligible to vote.
 Input : Age = 19
 Output : Eligible to Vote
 Explanation : Minimum voting age is 18 years.
 */
 import java.util.*;
 class Vote{
	 public static void main(String args[])
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the age ");
		 int a=sc.nextInt();
		/*  if(a>18)
		 {
			 System.out.println("Eligible");
		 }
		 else
			 System.out.println("NOt eligible"); */
		 String result=(a>=18) ? "eligible" : "not eligible";
		 System.out.println(""+result);
	 }
 }