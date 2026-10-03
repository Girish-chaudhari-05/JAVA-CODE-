/* import java.util.*;
public class Sum
{
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
	 System.out.println("Entr the four digit number");
	    
		int a=sc.nextInt();
	   
		int d1 = a % 10;       
		int d2 = (a / 10) % 10;
		int d3 = a / 100; 
		
		int sum = d1 + d2 + d3+d4;
		
		System.out.println("Sum of digit is "+a);
		System.out.println("Sum of digit is "+sum);
		
   }
} */
import java.util.*;
public class Sum{
	public static void main(String ars[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the four digit number");
		int a=sc.nextInt();
		int d1=a%100;
		int d2=a/10;
		int d3=(a/10)%10;
		int d4=a/10;
		int sum = d1 + d2 + d3 + d4;
		
		System.out.println("Sum of digit is "+a);
		System.out.println("Sum of digit is "+sum);
	}
}