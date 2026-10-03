import java.util.Scanner;

public class Character{

public static void main(String args[]){

Scanner sc = new Scanner(System.in);
System.out.println("Enter a charcter : ");
 char a= sc.next().charAt(0);
 
           
		   if((a >= 'A' && a <= 'Z') || (a >='a' && a <='z'))
		   {
		     System.out.println(" your input is character");
		   }else
		   {
		      System.out.println("Your input are not character");
		   }

}

}