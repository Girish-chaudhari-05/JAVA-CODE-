import java.util.Scanner;

public class Days{

public static void main(String x[]){
Scanner sc =new Scanner(System.in);
System.out.println("Enter a Month ");
int s = sc.nextInt();


                if(s == 1 || s== 3 || s==5 || s==7 || s==9 || s==11){
				System.out.println("This month having 31 days");
				} else if(s == 4 || s==6 || s==8 || s==10 |s==12 ){
				
				System.out.println("this month having 30 days");
				}else if(  	s==2) {
				  System.out.println("This month having 29 days");
				}else{
				  System.out.println("Enter a valid input");
				}

}

}