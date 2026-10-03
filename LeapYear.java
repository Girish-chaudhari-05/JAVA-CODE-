import java.util.Scanner;


public class LeapYear{

 public static void main(String x[]){
 
 Scanner sc = new Scanner(System.in);
 
 System.out.println("Enter a year :");
 int a = sc.nextInt();
 
             if(a % 4 == 0)
			 {
			   System.out.println("this year is leap year :");
			   
			 }else
			 {
			  System.out.println("this year not leap year :");
			 }
 
 }

}