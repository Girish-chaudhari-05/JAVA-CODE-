/* Q48. Write a Java program to find the minimum among three numbers.
 Input:
 A = 6
 B = 3
 C = 9
 Output : Minimum = 3
 Explanation : 3 is the smallest number. */
 
 import java.util.*;
 class MiniTh
 {
	 public static void main(String args[])
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the three number");
		 int a=sc.nextInt();
		  
		   System.out.println("Enter the number ");
		   int b=sc.nextInt();
		 
		  System.out.println("Enter the number ");
		  int c=sc.nextInt();
		 
		 int d=(a < b)  ? (a < c ? a : c): (b < c ? b : c);
		 System.out.println("minimum"+d);
	 }
 }