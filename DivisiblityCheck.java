import java.util.Scanner;

public class DivisiblityCheck{

public static void main(String args[]){

Scanner sc = new Scanner(System.in);
System.out.println("Enter a number :");
int a = sc.nextInt();


      if(a % 5 == 0 && a % 11==0)
	  {
       System.out.println("This number devisible by 5 and 11");	  
	  }else
	  {
	  System.out.println("This number not Divisible by 5 and 11");
	  }
}

}