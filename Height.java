import java.util.Scanner;

public class Height{

public static void main(String args[]){
 
  Scanner sc =new Scanner(System.in);
  System.out.println("Enter a height :");
  double a = sc.nextDouble();
  
  
   if(a < 150.0){
     System.out.println("the person is Dwarf");
   
   }else if(a>=150.0 && a<165.0)
    {
	   System.out.println("Person is average");
	}else if(a>=165.0 && a<=195.0)
	{
	  System.out.println("person is taller");
	}else
	{
	  System.out.println("person is too much taller");
	}

}

}