import java.util.Scanner;

public class Neon{
public static void main(String x[]){

Scanner sc= new Scanner(System.in);
System.out.println("Enter a number");
int a =sc.nextInt();

  
    int c = (a*a) ;
	
	if((c%10 + c/10) == a){
	 System.out.println("neon number");
	
	}else{
	System.out.println("not neon");
	}

}

}




