import java.util.Scanner;

public class PerfectSquare{
public static void main(String x[]){

Scanner sc= new Scanner(System.in);
System.out.println("Enter a number");
double a =sc.nextDouble();

  
  double b = Math.sqrt(a);
  
  String g = (b*b == a) ? "this is perfect square" : "this is not perfect square" ;
  System.out.println(g);

}

}




