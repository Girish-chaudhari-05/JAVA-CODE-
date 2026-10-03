/* Q32. Write a Java program to check whether a triangle is valid or not using its three angles.
 Input:
 Angle1 = 60
 Angle2 = 60
 Angle3 = 60
 Output : Valid Triangle
 Explanation : If the sum of all angles is exactly 180°, the triangle is valid.
 */
 
 import java.util.*;
 class Traingle
 {
	 public static void main(String args[])
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the side of first angle");
		 int a=sc.nextInt();
		 
		 System.out.println("Enter the side of second angle");
		 int b=sc.nextInt();
		 
		 System.out.println("Enter the side of Third angle");
		 int c=sc.nextInt();
		 
		 int sum=a+b+c;
		 if(sum==180)
		 {
			 System.out.println("The traingle is valid");
			 
		 }else
		 {
			 System.out.println("The traingle is not valid ");
		 }
		 
	 }
 }