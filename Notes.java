import java.util.Scanner;

public class Notes{

public static void main(String x[]){

  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a amount");
  int a = sc.nextInt();
  
    int n500=0,n100=0,n50=0,n20=0,n10=0,n5=0,n2=0,n1=0;
  
              if(a>=500)
			  {
			    n500 = a/500;
				a = a% 500;
               			  
			  }if (a>=100){
			    n100 = a /100;
				a= a%100;
				
			  }if(a>=50){
			     n50=a/50;
				 a=a%50;
				
			  }if(a>=20){
			   n20= a/20;
			   a=a%20;
			   
			  }if(a>=10){
			    n10= a/10;
				a = a%10;	
			  }if(a>=5){
			   n5 =a/5;
			   a= a%5;
			  }if(a>=2){
			  n2 = a/2;
			  a=a%2;
			 }if(a>=1){
			  n1 =a/1;
			  a =a%1;
			 
			  }


        System.out.println("500 = " + n500);
        System.out.println("100 = " + n100);
        System.out.println("50 = " + n50);
        System.out.println("20 = " + n20);
        System.out.println("10 = " + n10);
        System.out.println("5 = " + n5);
        System.out.println("2 = " + n2);
        System.out.println("1 = " + n1);

}


}