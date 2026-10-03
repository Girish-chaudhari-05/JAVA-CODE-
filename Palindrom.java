import java.util.Scanner;

public class Palindrom{
public static void main(String x[]){

Scanner sc= new Scanner(System.in);
System.out.println("Enter a number");
int a =sc.nextInt();

     int b = (a /100);
	 int c =  (a/100 )% 10;
	 int d = a%10;
	 
	 if(b==d){
	   System.out.println("number is palindrome");
	 
	 }else{
	  System.out.println("not an palindrom");
	 }

}




}