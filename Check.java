import java.util.Scanner;

public class Check{

public static void main(String x[]){
Scanner sc =new Scanner(System.in);

System.out.println("Enter a input");
char a = sc.next().charAt(0);

           
		   if(((a >= 'a'  && a <= 'z') && (a >= 'A'  && a <= 'Z')))
		   {
		     System.out.println("This is chracter :");
			 
		   }else if(a >= '0' && a <= '9')
		   {
		   System.out.println("This is number :");
		   }else
		   {
		   System.out.println("those are special character");
		   }


}

}