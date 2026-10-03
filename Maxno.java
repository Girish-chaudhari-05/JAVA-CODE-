/* Q47. Write a Java program to find the maximum between two numbers.
 Input:
 A = 14
 B = 9
 Output : Maximum = 14
 Explanation : 14 is greater than 9 */
 
 
 import java.util.*;
 class Maxno
 {
	 public static void main(String args[])
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the number ");
		 int a=sc.nextInt();
		 
		 System.out.println("Enter the number ");
		 int b=sc.nextInt();
		 
		 int c=(a>b) ? a : b;
		 System.out.println("maximum"+c);
			 
	 }
 
 }