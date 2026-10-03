import java.util.Scanner;


public class AgeCheck{

public static void main(String x[]){

Scanner sc = new Scanner(System.in);
System.out.println("enter a age : ");
int a = sc.nextInt();


         if(a<=10){
		    System.out.println("child");
		  }else if(a<18 && a>10){
		  System.out.println("Adult");
		  }else if(a>=18 && a<25){
		  System.out.println("Teenager");
		  }else if(a>25){
		  System.out.println("Senior");
		  }

}

}