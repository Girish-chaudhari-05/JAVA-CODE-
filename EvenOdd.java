import java.util.Scanner;

public class EvenOdd{

public static void main(String x[]){

Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
int a = sc.nextInt();

          if(a % 2 == 0) 
		  {
            System.out.println("Even number");
          }else{
		   System.out.println("odd number");  
		  }

}
}