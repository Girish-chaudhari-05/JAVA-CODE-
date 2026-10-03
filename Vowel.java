/* Q39. Write a Java program to input an alphabet and check whether it is a vowel or consonant.
 Input : Alphabet = e
 Output : Vowel
 Explanation : Vowels include a, e, i, o, u.
 */
 
 import java.util.*;
 class Vowel
 {
	 public static void main(String args[])
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the alphabate");
		  char ch=sc.next().charAt(0);
		  String a=(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') ? "Vowels":"Consonant";
		 
			  System.out.println(a);
		  
		 
	 }
 }