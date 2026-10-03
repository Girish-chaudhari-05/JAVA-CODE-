import java.util.Scanner;

public class Greater{

public static void main(String x[]){
Scanner sc= new Scanner(System.in);
System.out.println("Enter a number"); 
int a= sc.nextInt();

System.out.println("Enter a number");
int b = sc.nextInt();

   if(a>b){
    System.out.println("a is greater");
   }else if(b>a){
      System.out.println("b is greater");
   }else{
	   System.out.println("two number are equal");
   }

}

}