/* Q41. Write a Java program to find the maximum among three numbers.
 Input:
 A = 10
 B = 25
 C = 15
 Output : Maximum = 25
 Explanation : 25 is the largest among the three numbers.
 */
 
 import java.util.*;

class Max
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number ");
        int a = sc.nextInt();

        System.out.println("Enter the second number ");
        int b = sc.nextInt();

        System.out.println("Enter the third number ");
        int c = sc.nextInt();

       /*  if(a >= b && a >= c)
        {
            System.out.println("Maximum = " + a);
        }
        else if(b >= a && b >= c)
        {
            System.out.println("Maximum = " + b);
        }
        else
        {
            System.out.println("Maximum = " + c);
        } */
    
	int max = (a > b)  ? (a > c ? a : c): (b > c ? b : c);
	System.out.println("Large number is"+max);
	}
}
