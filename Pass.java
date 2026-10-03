/* Q48. Write a Java program to print Pass if marks are 40 or above, otherwise Fail.
 Input : Marks = 38
 Output : Fail
 Explanation : Marks are below the passing criteria.
 */
 
 import java.util.*;
 class Pass{
	 public static void main(String args[])
	 {
		 Scanner sc =new Scanner(System.in);
		 System.out.println("Enter the number");
		 int a=sc.nextInt();
		 if(a>=40)
		 {
			 System.out.println("Pass");
		 }
		 else
			 System.out.println("Fail");
	 }
 }