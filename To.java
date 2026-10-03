/* Q49. Given marks out of 100, print grade using nested ternary operators.
 Input : Marks = 82
 Output : Good
 Explanation : 82 falls in the “Good” category.
 */
 
 import java.util.*;
 class To
 {
	 public static void main(String args[])
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the number");
		 int a=sc.nextInt();
		 
		 String result=(a<=80) ? "Average":"Good";
		  System.out.println(""+result);
	 }
 }