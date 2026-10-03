import java.util.Scanner;


public class Spring{

public static void main(String x[]){

Scanner sc = new Scanner(System.in);
System.out.println("enter a month : ");
int a = sc.nextInt();
  
                        
						if(a==12 || a==1 || a==2){
						  System.out.println("Winter");
						}else if(a==3 || a==4 || a==5){
						  System.out.println("spring");
						}else if(a==6 || a==7 || a==8){
						   System.out.println("Summner");
						}else if(a==9 || a==10 || a==11){
						 System.out.println("Autumn");
						 }else{
						  System.out.println("Enter a valid input");
						 }

		

}

}