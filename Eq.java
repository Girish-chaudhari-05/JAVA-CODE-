/* Q13. Write a java program to accept two integers and check whether they are equal or not.
 */
 import java.util.*;
 class Eq
 {
	 public static void main(String args[])
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the two number ");
		 int a=sc.nextInt();
		 int b=sc.nextInt();
		 if(a==b)
		 {
			 System.out.println("Equal");
		 }else
		 {
			  System.out.println("not Equal");
		 }
		 
	 }
 }