import java.util.Scanner;

public class Percentage{

public static void main(String args[]){
 
  Scanner sc =new Scanner(System.in);
  System.out.println("Enter a height :");
  int a = sc.nextInt();
   System.out.println("Enter a height :");
  int b = sc.nextInt();
   System.out.println("Enter a height :");
  int c = sc.nextInt();
   System.out.println("Enter a height :");
  int d = sc.nextInt();
   System.out.println("Enter a height :");
  int e = sc.nextInt();
  
   int p = a + b + c + d + e /5 ;
  
   if(p >=90){
     System.out.println("Grade A");
   
   }else if(p>=80)
    {
	   System.out.println("grade B");
	}else if(p>=70)
	{
	  System.out.println("Grade c");
	}else if(p>=60)
	{
	  System.out.println("Grade D");
	}else if(p>=40)
	{
	  System.out.println("Grade E");
	}else if(p<40)
	{
	  System.out.println("Grade f");
	}
	
	
	

}

}