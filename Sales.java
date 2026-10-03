import java.util.Scanner;

public class Sales{

public static void main(String x[]){
Scanner sc= new Scanner(System.in);
System.out.println("Enter a number"); 
int a= sc.nextInt();



   if(a<5000){
     int b = ((a * 2) /100);
    System.out.println("Commision amount"+ b);
   }else if(a>=5000 || a<=10000){
      int c = ((a * 5)/100);
      System.out.println("Commision"+c);
   }else if(a>10000){
        int d= (( a *10)/100);
	   System.out.println("Commmision amount" + d);
   }

}

}