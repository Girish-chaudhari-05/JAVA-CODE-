//								Assignment 2 using command line 


// 1)Addition of 2 number using cmd line args

/*
public class Second
{
	public static void main(String args[])
	{
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);

		int sum = num1 + num2;
		int sum1 = num1 - num2;
		int sum2 = num1 * num2;
		int sum3 = num1 / num2;
		int sum4 = num1 % num2;

		System.out.println("First number: " + num1);
		System.out.println("Second number: " + num2);
		System.out.println("Sum is: " + sum);
		System.out.println("Sum is: " + sum1);
		System.out.println("Sum is: " + sum2);
		System.out.println("Sum is: " + sum3);
		System.out.println("Sum is: " + sum4);
	}
}
*/

// 6) convert to centimeter into meter and kilometer.
  /* 
   class Second
   {
	   public static void main(String args[])
	   {
		   int cen  = Integer.parseInt(args[0]);
		   double a = cen / 100.0;
		   double b = cen / 100000.0;
		   
		   System.out.println("Centimeter to meter is "+a);
		    System.out.println("Centimeter to kilometer is "+b);
	   }
   }

*/


// 7)convert temperature from Fahrenheit to Celsius.
 //Formula: C = (F − 32) × 5 / 9
/*
class Second
{
	public static void main(String args[])
	{
		double F=Integer.parseInt(args[0]);
		int a=32;
		int b=5;
		int d=9;
		
		double c=(F-a)*b/d;
		
		System.out.println("Fahrenheit to Celsius is %.2f "+c);
		
	}
}
*/

// 8)convert temperature from Celsius to Fahrenheit.
 //Formula: F = (C × 9 / 5) + 32
 /*
 class Second
 {
	 public static void main(String args[])
	 {
		
		 int c=Integer.parseInt(args[0]);
		 int f= (c*9/5)+32;
		 System.out.println("Celsius to Fahrenheit is %.2f "+f);
		 
		 
	 }
 }
 */
 
 // 9) Java program to enter two angles of a triangle and find the third angle.

/*
class Second
{
	public static void main(String args[])
	{
		int a1=Integer.parseInt(args[0]);
		int a2=Integer.parseInt(args[1]);
		 double area = 180 - (a1+a2);	
		 
		 System.out.println("Third angle is  "+area);
		 
	}
}

*/

//10)calculate the area of an equilateral triangle.
/* 
class Second{
	public static void main(String args[])
	{
		double side=Double.parseDouble(args[0]);
		double area =(Math.sqrt(3)/4)*side*side;
		 System.out.println("Area of an equilateral triangle is  "+area);
	}
}
 */

//11) Write a Java program to enter marks of five subjects and calculate total marks and percentage.

/*
class Second
{
	public static void main(String args[])
	{
		int sub1=Integer.parseInt(args[0]);
		int sub2=Integer.parseInt(args[1]);
		int sub3=Integer.parseInt(args[2]);
		int sub4=Integer.parseInt(args[3]);
		int sub5=Integer.parseInt(args[4]);
		
		int Total = sub1+sub2+sub3+sub4+sub5;
		int percentage=Total/5;
		System.out.println("total marks is  "+Total);
		System.out.println(" percentage is  "+percentage);
	}
}

*/

//12 Java program to calculate simple interest.
/*
class Second {
    public static void main(String args[]) {

        double principal = Double.parseDouble(args[0]);
        double rate = Double.parseDouble(args[1]);
        double time = Double.parseDouble(args[2]);

        double si = (principal * rate * time) / 100;

        System.out.println("Simple Interest = " + si);
    }
}
*/

//Q13. Write a Java program to calculate compound interest.
/* 
class Second {
    public static void main(String args[]) {

        double principal = Double.parseDouble(args[0]);
        double rate = Double.parseDouble(args[1]);
        double time = Double.parseDouble(args[2]);

        double amount = principal * Math.pow((1 + rate / 100), time);
        double ci = amount - principal;

        System.out.println("Compound Interest = " + ci);
    }
} */

//Q14. Write a Java program to swap two numbers using a third variable.
/* 
class Second {
    public static void main(String args[]) {

        int A = Integer.parseInt(args[0]);
        int B = Integer.parseInt(args[1]);

        int temp;  

        temp = A;
        A = B;
        B = temp;

        System.out.println("After Swapping:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
    }
} */

//Q15. Write a Java program to swap two numbers without using a third variable.
/* 
class Second{
	public static void main(String args[])
	{
		int A =Integer.parseInt(args[0]);
		int B=Integer.parseInt(args[1]);
		 A=A+B;
		 B=A-B;
		 A=A-B;
		 System.out.println("swap two numbers without using a third variable");
		System.out.println("A = " + A);
        System.out.println("B = " + B);
	}
} */

//Q16. Write a Java program to print the ASCII value of a given character.
/* 
public class Second{
	public static void main(String args[])
	{
		char ch ='A';
		 int ascii = ch;
		System.out.println("char value of"+ch);
		System.out.println("ASCII value of"+ascii);
	}
} */


// 17)Java program to convert seconds into hours, minutes, and seconds.


/* hours   = 3665 / 3600 = 1 hour
minutes = (3665 % 3600) / 60 = 1 minute
seconds = 3665 % 60 = 5 seconds */

/* 
class Second
{
	public static void main(String args[])
	{
		int a = 3665 /3600;
		int min = (3665 % 3600) /60;
		int sec = 3665 % 60;
		
		System.out.println("hr"+a);
		System.out.println("Min"+min);
		System.out.println("sec"+sec);
	}
}
  */
    


//Q18. Write a Java program to convert days into years, months, and weeks.

/*
class Second {
    public static void main(String args[]) {
        
        int days = Integer.parseInt(args[0]);

        int years = days / 365;
        int remainingDays = days % 365;

        int months = remainingDays / 30;
        remainingDays = remainingDays % 30;

        int weeks = remainingDays / 7;
        remainingDays = remainingDays % 7;

        System.out.println("Years: " + years);
        System.out.println("Months: " + months);
        System.out.println("Weeks: " + weeks);
        System.out.println("Days: " + remainingDays);
    }
}

*/

/*Q19. Write a Java program that reads a number and displays its cube.
 Input : Number = 4
 Output : Cube = 64
*/
/*
class Second{
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]);
		int b=a*a*a;
		System.out.println("The cube is "+b);
	}
}
*/

/*Q20. Write a Java program to compute the sum of digits of an integer.
Input : 123
Output : 6
Explanation : Digits are added: 1 + 2 + 3 = 6.
*/
/*

class Second{
	public static void main(String args[])
	{
		
		int a =Integer.parseInt(args[0]);
		int d1 = a % 10;       
		int d2 = (a / 10) % 10;
		int d3 = a / 100;      
		int sum = d1 + d2 + d3;
		System.out.println("Sum of number is "+sum);
	}
}

*/

/* 21)Write a Java program to compute the sum of digits of an integer.
Input : 123 to reverse the number and sum using not operater
*/
/*
class Second {
    public static void main(String args[]) {
		
	int num=Integer.parseInt(args[0]); 
    int rev=0;
    rev=rev*10+num%10;
    num=num/10;
	
    rev=rev*10+num%10;
    num=num/10;
	
	rev=rev*10+num%10;
    num=num/10;
	
   
        System.out.println("Reverse = " + rev);
        System.out.println("Sum = " + num);

        
    }
}

*/

/*
Q22. Write a Java program to find the first and last digit of a three-digit number without using a loop.
 Input : 456

*/
/* import java.util.Scanner;

class Second {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a three digit number: ");
        int num = sc.nextInt();
        
        int firstDigit = num / 100;
        int lastDigit = num % 10;
        
        System.out.println("First Digit = " + firstDigit);
        System.out.println("Last Digit = " + lastDigit);
        
        sc.close();
    }
} */
/*
Q23. Write a Java program to calculate the sum of the first and last digit without using a loop.
 Input : 123
 Output : 4

*/
/* import java.util.*;
class Second {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a three digit number: ");
        int num = sc.nextInt();
        
        int firstDigit = num / 100;
        int lastDigit = num % 10;
        int sum = firstDigit+lastDigit;
        System.out.println("First Digit = " + sum);
        
        sc.close();
	}
} */

/*Q24. Write a Java program to check whether a number is a Neon number or not.
 Input : 9
 Output : Neon Number
 Explanation : 9² = 81 → 8 + 1 = 9.
*/
/* 
 import java.util.*;

    class Second{
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number ");
			int num=sc.nextInt();
			int sum=num*num;
			int firstDigit = sum / 10;
            int lastDigit = sum % 10;
			System.out.println("First Digit = " + sum);
			System.out.println("First Digit = " + firstDigit);
			System.out.println("Last Digit = " + lastDigit);
		}
} */

/*
Q26. Write a Java program to check whether a number is a Spy number.
 Input: 1412
 Output : Spy Number
 Explanation : Sum = 8, Product = 8.

*/
/* import java.util.Scanner;

class Second {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 4 digit number: ");
        int num = sc.nextInt();
        
        int d1 = num / 1000;
        int d2 = (num / 100) % 10;
        int d3 = (num / 10) % 10;
        int d4 = num % 10;
        
        int sum = d1 + d2 + d3 + d4;
        int product = d1 * d2 * d3 * d4;
        
        System.out.println("Sum = " + sum);
        System.out.println("Product = " + product);
        
        sc.close();
    }
}
 */
 
 /*
 Q27. Write a Java program to toggle the case of an alphabet using ASCII values.
 Input : a
 Output : A
 Explanation : ASCII values are used to change case.

 */
 
 /* import java.util.*;

class Second {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character:");
        
        char ch = sc.next().charAt(0);
        
        ch = (char)(ch ^ 32);   
        
        System.out.println("Toggled character: " + ch);
    }
}
 */
 
 /*
 Q28. Write a Java program to calculate the net salary of an employee.
 Input:
 Basic = 20000
 HRA = 10%
 DA = 5%
 Tax = 2%
 Output : Net Salary = 22600

 */
 import java.util.*;

class Second {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Basic Salary: ");
        int basic = sc.nextInt();
        
        int hra = basic * 10 / 100;   
        int da  = basic * 5 / 100;    
        int tax = basic * 2 / 100;    
        
        int netSalary = basic + hra + da - tax;
        
        System.out.println("HRA = " + hra);
        System.out.println("DA = " + da);
        System.out.println("Tax = " + tax);
        System.out.println("Net Salary = " + netSalary);
    }
}
