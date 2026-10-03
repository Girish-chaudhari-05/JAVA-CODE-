/* Q43. Write a Java program to accept two integers and check whether they are equal.
 Input:
 A = 50
 B = 50
 Output : Equal
 Explanation : Both numbers have the same value.
 */
 
 import java.util.*;
 class Equal{
	 public static void main(String args[])
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the first number ");
		 int a=sc.nextInt();
		 
		 System.out.println("Enter the second number ");
		 int b=sc.nextInt();
		 
		 String result=(a==b) ? "Equal":"Not Equal";
		 System.out.println(""+result);
	 }
 }