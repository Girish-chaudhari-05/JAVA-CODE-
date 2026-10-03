import java.util.Scanner;

public class Equilateral{


public static void main(String args []){

Scanner sc = new Scanner(System.in);
System.out.println("Enter a first side :");
int a = sc.nextInt();

System.out.println("Enter a secound side :");
int b = sc.nextInt();

System.out.println("Enter a third side :");
int c = sc.nextInt();


        if(a == b && b==c && c==a)
		{
		System.out.println("This triangle is Equilateral"); 
		}else if ((a==b && a!=b || b==c && a!=b || a==c && a!=b && a==c))
		{
		 System.out.println("This is isoscale triangle");
		}else
		{
		System.out.println("Scalene Triangle");
		}

}

}