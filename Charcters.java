import java.util.Scanner;

public class Charcters{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);
System.out.println("Enter a character");
char a = sc.next().charAt(0);


    if(a >= 'A' && a <= 'Z')
	{
	System.out.println("this charcter is uppercase");
	}else if (a >= 'a' && a <= 'z')
	{
	  System.out.println("this charcter is lowercase");
	}else{
	    
		 System.out.println("not valid charcter");
	  }

}
}