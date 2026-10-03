/* Q37. Write a Java program to input cost price and selling price and determine profit or loss.
 Input:
 Cost Price = 500
 Selling Price = 650
 Output : Profit
 Explanation : Selling price is greater than cost price. */
 
 import java.util.*;
 class Profit{
	 public static void main(String args[])
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the cost price ");
		 int a=sc.nextInt();
		 
		 System.out.println("Enter the selling price ");
		 int b=sc.nextInt();
		 if(b>a)
		 {
			 System.out.println("Profit  ");
		 }
		 else	
		 	 System.out.println("Loss ");
	 }
 }