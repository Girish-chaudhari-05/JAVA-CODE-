import java.util.Scanner;

public class Marks{
public static void main(String x[]){

Scanner sc= new Scanner(System.in);
System.out.println("Enter a mark");
int a =sc.nextInt();



           if(a>=90)
		   {
		    System.out.println("excelent");
		   }else if(a>=75) 
		   {
		   System.out.println("good ");
		   }else if(a>=50){
		     System.out.println("average");
		   } else if (a<50){
		     System.out.println("poor");
		   }


}

}




