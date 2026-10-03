import java.util.Scanner;

public class Max{
public static void main(String x[]){

Scanner sc= new Scanner(System.in);
System.out.println("Enter a number");
int a =sc.nextInt();

int b = a % 10;
int c = a /10 ;


           if(b>c)
		   {
		    System.out.println("b is maximum");
		   }else if(c>b)
		   {
		   System.out.println("c is  maximum");
		   }else{
			   
			   System.out.println("Two number are equal");
		   }


}

}




