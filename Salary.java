import java.util.Scanner;

public class Salary{

public static void main(String args[]){

Scanner sc = new Scanner(System.in);
System.out.println("Enter a service");
int a = sc.nextInt();

System.out.println("Enter a salary");
int b = sc.nextInt();
    
	 if(a>=5){
	    int c = ((b * 5) /100)+ b;
        System.out.println("You are eligible for bonus " + c);		
	 }else{
	   System.out.println("you are not eligible for bonus");
	 
	 }



}

}