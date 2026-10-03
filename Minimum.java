/* Q45. Write a Java program to find the minimum between two numbers.
 Input:
 A = 8
 B = 12
 Output : Minimum = 8
 Explanation : 8 is smaller than 12.
 */
 
 import java.util.*;
 class Minimum
 {
	 public static void main(String args[])
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the number ");
		 int a=sc.nextInt();
		 
		 System.out.println("Enter the number ");
		 int b=sc.nextInt();
		 
		 int c=(a<b) ? a : b;
		 System.out.println("minimum"+c);
			 
	 }
 }