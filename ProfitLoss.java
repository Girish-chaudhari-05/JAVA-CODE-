import java.util.Scanner;


public class ProfitLoss{

public static void main(String args[]){

Scanner sc = new Scanner(System.in);
System.out.println("Enter a Selling price :");
int Selling= sc.nextInt();

System.out.println("Enter a cost Price :");
int cost  = sc.nextInt();
 


                if(Selling > cost )
				{
				  System.out.println("profit");
				}else if (Selling < cost)
				{
				System.out.println("Losss");
				}else
				{
					"neither profit nor loss"
				}


}

}