/* Q33. Write a Java program to check whether a triangle is equilateral, isosceles, or scalene.
 Input:
 Side1 = 5
 Side2 = 5
 Side3 = 5
 Output : Equilateral Triangle
 Explanation : All sides are equal, so the triangle is equilateral.
 */
 import java.util.*;
 
 class Equilateral
 {
	 public static void main(String args[])
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the first side of traingle ");
		 int a=sc.nextInt();
		 
		 System.out.println("enter the second side of traingle ");
		 int b=sc.nextInt();
		 
		 
		System.out.println("enter the Third side of traingle ");
		 int c=sc.nextInt();
		 
		 if( a==b && b==c)
		 {
			 System.out.println("The traingle is equilateral");
		 }
		 else
			 System.out.println("The traingle is not equilateral");
	 }
 }