import java.util.Scanner;

public class MaximumNumber{

public static void main(String x[]){
Scanner sc =new Scanner(System.in);

System.out.println("Enter a input :");
int a = sc.nextInt();

System.out.println("Enter a secound number :");
int b = sc.nextInt();

System.out.println("Enter a third number :");
int c= sc.nextInt();

           
		   if((a>b && a>c))
		   {
		     System.out.println("A is greater :");
			 
		   }else if(b>c)
		   {
		   System.out.println("b is greater :");
		   }else
		   {
		   System.out.println("C is greater");
		   }


}

}