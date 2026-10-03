/* Q36. Write a Java program to check whether a character is an alphabet or not.
 Input : Character = A
 Output : Alphabet
 Explanation : Alphabet characters fall between A–Z or a–z. */
 
 import java.util.*;
 class Character
 {
	 public static void main(String args[])
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the Character");
		 char ch = sc.next().charAt(0);
		 if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
		 {
			 System.out.println("It is alphabet");
		 }
		 else

           System.out.println("It is not alphabet");
		 
	 }
 }