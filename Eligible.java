import java.util.Scanner;

public class Eligible{
public static void main(String x[]){

   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a attendence");
    int a = sc.nextInt();
	
	
	 System.out.println("Enter a marks");
	 int b = sc.nextInt();
	 
	    if(a>=75 && b>=80){
		 System.out.println("Eligible");
		}else{
		System.out.println("not eligble");
		 }   
}
}