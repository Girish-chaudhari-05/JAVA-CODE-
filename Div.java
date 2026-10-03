/* Q35. Write a Java program to check whether a number is divisible by both 5 and 11.
 Input : Number = 55
 Output : Divisible by 5 and 11
 Explanation : 55 is divisible by both 5 and 11.
 */
 
 import java.util.*;
 class Div
 {
	 public static void main(String args[])
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the number");
		 int a=sc.nextInt();
		 
		 
		 if(a % 5==0 && a % 11==0)
			 
		 {
			 System.out.println("The number is divisible by 5 and 11");
		 }
		 else
			  System.out.println("The number is not divisible by 5 and 11");
		 
	 }
 }