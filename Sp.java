/* Q40. Write a Java program to check whether a character is an alphabet, digit, or special character.
 Input : Character = @
 Output : Special Character
 Explanation : Characters outside alphabets and digits are special characters.
 */
 import java.util.*;
 class Sp
 {
	 public static void main(String args[])
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the character");
		 char ch=sc.next().charAt(0);
		 
		 String a=(ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') ? "alphabet":"not alphabet";
		 System.out.println(""+a);
		 

		 String b=(ch >= 0 && ch <= 100) 	? "number ":"not number";
		 System.out.println(""+b);
		 
		 
		String c=(ch == '@' && ch =='#' && ch=='!' && ch=='%' ) ? "not special charater  ":"special charater ";
		System.out.println(""+c);
	
		

		 	 }
 }