import java.util.Scanner;

public class PositiveNegative{

public static void main(String args[]){

Scanner sc = new Scanner(System.in);
System.out.println("Enter a number :");
int a = sc.nextInt();


      if(a==0)
	  {
       System.out.println("This is 0 :");	  
	  }else if(a>0)
	  {
	  System.out.println("This number is postive:");
	  }else if(a<0)
	  {
	  System.out.println("this number is negative");
	  }
}

}